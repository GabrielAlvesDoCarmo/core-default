package br.com.gds.core.login_module.commons.network.exception

sealed class CustomDatabaseException(
    message: String? = null,
    cause: Throwable? = null
) : Exception(message, cause) {
    class DatabaseError(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomDatabaseException(message, cause)
}