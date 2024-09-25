package br.com.gds.core.login_module.commons.network.extensions

import br.com.gds.core.login_module.commons.network.constants.FirebaseMsgError
import br.com.gds.core.login_module.commons.network.exception.HttpException
import br.com.gds.core.login_module.commons.network.state.RequestState

fun HttpException.httpException() = when (this) {
    is HttpException.ForbiddenException -> RequestState.Error(
        FirebaseMsgError.HttpError.FORBIDDEN_403, this
    )

    is HttpException.NotFoundException -> RequestState.Error(
        FirebaseMsgError.HttpError.NOT_FOUND_404, this
    )

    is HttpException.UnauthorizedException -> RequestState.Error(
        FirebaseMsgError.HttpError.UNAUTHORIZED_401, this
    )

    is HttpException.UnknownHttpException -> RequestState.Error(
        FirebaseMsgError.HttpError.UNKNOWN, this
    )
}