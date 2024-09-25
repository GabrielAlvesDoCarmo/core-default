package br.com.gds.core.login_module.commons.network.state


sealed interface RequestState<out T> {
    data class Success<T>(val response: T) : RequestState<T>
    data class Error(
        val message: String,
        val error: Exception
    ) : RequestState<Nothing>
}