package br.com.gds.core.login_module.commons.network.exception

sealed class HttpException(
    message: String? = null,
    cause: Throwable? = null,
    val httpResultCode: Int
) : Exception(message, cause) {
    class NotFoundException(
        message: String? = null,
        cause: Throwable? = null
    ) : HttpException(message, cause, 404)

    class ForbiddenException(
        message: String? = null,
        cause: Throwable? = null
    ) : HttpException(message, cause, 403)

    class UnauthorizedException(
        message: String? = null,
        cause: Throwable? = null
    ) : HttpException(message, cause, 401)

    class UnknownHttpException(
        message: String? = null,
        cause: Throwable? = null
    ) : HttpException(message, cause, 0)
}