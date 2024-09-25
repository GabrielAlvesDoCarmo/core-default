package br.com.gds.core.login_module.provider

import br.com.gds.core.login_module.model.login.LoginRequest
import br.com.gds.core.login_module.model.login.LoginResponse
import br.com.gds.core.login_module.model.register.RegisterRequest
import br.com.gds.core.login_module.model.register.RegisterResponse
import br.com.gds.core.login_module.model.resetpassword.ResetPasswordRequest

sealed interface AuthenticatorFirebaseProvider {
    interface Login {
        suspend fun login(login: LoginRequest): LoginResponse
    }

    interface Register {
        suspend fun register(registerRequest: RegisterRequest): RegisterResponse
    }

    interface ResetPassword <T> {
        suspend fun resetPassword(email: ResetPasswordRequest): T
    }

    interface AuthFirebase <T> {
        suspend fun isUserLogged(): T
        suspend fun logout(): T
    }
}