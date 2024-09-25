package br.com.gds.core.login_module.provider

import br.com.gds.core.login_module.commons.network.state.RequestState
import br.com.gds.core.login_module.model.login.LoginRequest
import br.com.gds.core.login_module.model.login.LoginResponse
import br.com.gds.core.login_module.model.register.RegisterRequest
import br.com.gds.core.login_module.model.register.RegisterResponse
import br.com.gds.core.login_module.model.resetpassword.ResetPasswordRequest

sealed interface AuthenticatorFirebaseProvider {
    interface Login {
        suspend fun login(login: LoginRequest): RequestState<LoginResponse>
    }

    interface Register {
        suspend fun register(registerRequest: RegisterRequest): RequestState<RegisterResponse>
    }

    interface ResetPassword <T> {
        suspend fun resetPassword(email: ResetPasswordRequest): RequestState<T>
    }

    interface AuthFirebase <T> {
        suspend fun isUserLogged():  RequestState<T>
        suspend fun logout():  RequestState<T>
    }
}