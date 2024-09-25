package br.com.gds.core.login_module.commons.network.exception

sealed class CustomAuthException(
    message: String? = null,
    cause: Throwable? = null
) : Exception(message, cause) {

    class WeakPasswordException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomAuthException(message, cause)

    class EmailException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomAuthException(message, cause)

    class InvalidUserException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomAuthException(message, cause)

    class UserCollisionException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomAuthException(message, cause)

    class RecentLoginRequiredException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomAuthException(message, cause)

    class UnknownAuthException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomAuthException(message, cause)
}