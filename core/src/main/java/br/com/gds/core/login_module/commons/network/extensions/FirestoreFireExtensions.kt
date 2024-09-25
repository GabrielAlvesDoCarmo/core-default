package br.com.gds.core.login_module.commons.network.extensions

import br.com.gds.core.login_module.commons.network.constants.FirebaseMsgError
import br.com.gds.core.login_module.commons.network.exception.CustomFirestoreException
import br.com.gds.core.login_module.commons.network.state.RequestState

fun CustomFirestoreException.firestoreException() = when (this) {
    is CustomFirestoreException.AbortedException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_ABORTED, this
    )

    is CustomFirestoreException.AlreadyExistsException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_ALREADY_EXISTS, this
    )

    is CustomFirestoreException.CancelledException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_CANCELLED, this
    )

    is CustomFirestoreException.DataLossException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_DATA_LOSS, this
    )

    is CustomFirestoreException.DeadlineExceededException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_DEADLINE_EXCEEDED, this
    )

    is CustomFirestoreException.FailedPreconditionException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_FAILED_PRECONDITION, this
    )

    is CustomFirestoreException.InternalException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_INTERNAL, this
    )

    is CustomFirestoreException.InvalidArgumentException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_INVALID_ARGUMENT, this
    )

    is CustomFirestoreException.NotFoundException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_NOT_FOUND, this
    )

    is CustomFirestoreException.OutOfRangeException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_OUT_OF_RANGE, this
    )

    is CustomFirestoreException.PermissionDeniedException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_PERMISSION_DENIED, this
    )

    is CustomFirestoreException.ResourceExhaustedException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_RESOURCE_EXHAUSTED, this
    )

    is CustomFirestoreException.UnauthenticatedException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_UNAUTHENTICATED, this
    )

    is CustomFirestoreException.UnavailableException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_UNAVAILABLE, this
    )

    is CustomFirestoreException.UnimplementedException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_UNIMPLEMENTED, this
    )

    is CustomFirestoreException.UnknownException -> RequestState.Error(
        FirebaseMsgError.Firestore.FIRESTORE_UNKNOWN, this
    )
}