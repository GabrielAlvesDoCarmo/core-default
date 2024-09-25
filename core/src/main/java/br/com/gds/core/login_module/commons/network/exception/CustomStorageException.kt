package br.com.gds.core.login_module.commons.network.exception

sealed class CustomStorageException(
    message: String? = null,
    cause: Throwable? = null
) : Exception(message, cause) {

    class RetryLimitExceededException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class QuotaExceededException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class ProjectNotFoundException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class ObjectNotFoundException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class BucketNotFoundException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class CancelledException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class InvalidChecksumException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class NotAuthenticatedException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class NotAuthorizedException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

    class UnknownStorageException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomStorageException(message, cause)

}