package br.com.gds.core.login_module.commons.network.exception

sealed class CustomFirestoreException(
    message: String? = null,
    cause: Throwable? = null
) : Exception(message, cause) {
    class CancelledException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class UnknownException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class InvalidArgumentException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class DeadlineExceededException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class NotFoundException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class AlreadyExistsException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class PermissionDeniedException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class ResourceExhaustedException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class FailedPreconditionException(
        message: String? = null,
        cause: Throwable?= null
    ) : CustomFirestoreException(message, cause)

    class AbortedException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class OutOfRangeException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class UnimplementedException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class InternalException(
        message: String? = null,
        cause: Throwable?= null
    ) : CustomFirestoreException(message, cause)

    class UnavailableException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class DataLossException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)

    class UnauthenticatedException(
        message: String? = null,
        cause: Throwable? = null
    ) : CustomFirestoreException(message, cause)
}