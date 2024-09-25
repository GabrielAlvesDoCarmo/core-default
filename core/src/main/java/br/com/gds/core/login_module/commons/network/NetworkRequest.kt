package br.com.gds.core.login_module.commons.network

import br.com.gds.core.login_module.commons.network.constants.FirebaseMsgError
import br.com.gds.core.login_module.commons.network.exception.CustomAuthException
import br.com.gds.core.login_module.commons.network.exception.CustomDatabaseException
import br.com.gds.core.login_module.commons.network.exception.CustomFirestoreException
import br.com.gds.core.login_module.commons.network.exception.CustomStorageException
import br.com.gds.core.login_module.commons.network.exception.HttpException
import br.com.gds.core.login_module.commons.network.extensions.databaseException
import br.com.gds.core.login_module.commons.network.extensions.fireAuthException
import br.com.gds.core.login_module.commons.network.extensions.firestoreException
import br.com.gds.core.login_module.commons.network.extensions.httpException
import br.com.gds.core.login_module.commons.network.extensions.storageException
import br.com.gds.core.login_module.commons.network.state.RequestState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


suspend inline fun <reified T : Any?> requestCall(
    noinline action: suspend () -> T
): RequestState<T> {
    return try {
        val taskResponse = withContext(Dispatchers.IO) { action() }
        RequestState.Success(taskResponse)
    } catch (exception: Exception) {
        return when (exception) {
            is CustomAuthException -> exception.fireAuthException()
            is CustomFirestoreException -> exception.firestoreException()
            is CustomStorageException -> exception.storageException()
            is CustomDatabaseException -> exception.databaseException()
            is HttpException -> exception.httpException()
            else -> RequestState.Error(
                FirebaseMsgError.Exception.EXCEPTION_UNKNOWN, exception
            )
        }
    }
}






