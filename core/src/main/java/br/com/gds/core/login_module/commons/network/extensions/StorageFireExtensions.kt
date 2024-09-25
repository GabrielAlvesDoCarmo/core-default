package br.com.gds.core.login_module.commons.network.extensions

import br.com.gds.core.login_module.commons.network.constants.FirebaseMsgError
import br.com.gds.core.login_module.commons.network.exception.CustomStorageException
import br.com.gds.core.login_module.commons.network.state.RequestState


fun CustomStorageException.storageException() = when (this) {
    is CustomStorageException.BucketNotFoundException -> RequestState.Error(
        FirebaseMsgError.Storage.BUCKET_NOT_FOUND, this
    )

    is CustomStorageException.CancelledException -> RequestState.Error(
        FirebaseMsgError.Storage.CANCELLED, this
    )

    is CustomStorageException.ProjectNotFoundException -> RequestState.Error(
        FirebaseMsgError.Storage.PROJECT_NOT_FOUND, this
    )

    is CustomStorageException.NotAuthorizedException -> RequestState.Error(
        FirebaseMsgError.Storage.NOT_AUTHORIZED, this
    )

    is CustomStorageException.UnknownStorageException -> RequestState.Error(
        FirebaseMsgError.Storage.UNKNOWN, this
    )

    is CustomStorageException.InvalidChecksumException -> RequestState.Error(
        FirebaseMsgError.Storage.INVALID_CHECKSUM, this
    )

    is CustomStorageException.NotAuthenticatedException -> RequestState.Error(
        FirebaseMsgError.Storage.NOT_AUTHENTICATED, this
    )

    is CustomStorageException.ObjectNotFoundException -> RequestState.Error(
        FirebaseMsgError.Storage.OBJECT_NOT_FOUND, this
    )

    is CustomStorageException.QuotaExceededException -> RequestState.Error(
        FirebaseMsgError.Storage.QUOTA_EXCEEDED, this
    )

    is CustomStorageException.RetryLimitExceededException -> RequestState.Error(
        FirebaseMsgError.Storage.RETRY_LIMIT_EXCEEDED, this
    )
}