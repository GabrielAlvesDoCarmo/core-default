package br.com.gds.core.login_module.commons.network.extensions

import br.com.gds.core.login_module.commons.network.constants.FirebaseMsgError
import br.com.gds.core.login_module.commons.network.exception.CustomAuthException
import br.com.gds.core.login_module.commons.network.state.RequestState

fun CustomAuthException.fireAuthException() = when (this) {
    is CustomAuthException.WeakPasswordException -> RequestState.Error(
        FirebaseMsgError.Auth.WEAK_PASSWORD, this
    )

    is CustomAuthException.EmailException -> RequestState.Error(
        FirebaseMsgError.Auth.INVALID_EMAIL, this
    )

    is CustomAuthException.InvalidUserException -> RequestState.Error(
        FirebaseMsgError.Auth.INVALID_USER, this
    )

    is CustomAuthException.UserCollisionException -> RequestState.Error(
        FirebaseMsgError.Auth.USER_COLLISION, this
    )

    is CustomAuthException.RecentLoginRequiredException -> RequestState.Error(
        FirebaseMsgError.Auth.RECENT_LOGIN_REQUIRED, this
    )

    is CustomAuthException.UnknownAuthException -> RequestState.Error(
        FirebaseMsgError.Auth.ERROR_UNKNOWN, this
    )
}