package br.com.gds.core.login_module.commons.network.extensions

import br.com.gds.core.login_module.commons.network.constants.FirebaseMsgError
import br.com.gds.core.login_module.commons.network.exception.CustomDatabaseException
import br.com.gds.core.login_module.commons.network.state.RequestState

fun CustomDatabaseException.databaseException() = when (this) {
    is CustomDatabaseException.DatabaseError -> RequestState.Error(
        FirebaseMsgError.Database.ERROR_DATABASE, this
    )
}