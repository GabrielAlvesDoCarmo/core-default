package br.com.gds.core.login_module.provider

import br.com.gds.core.login_module.model.login.LoginRequest
import br.com.gds.core.login_module.model.register.RegisterRequest
import br.com.gds.core.login_module.model.resetpassword.ResetPasswordRequest

sealed interface AuthFirebaseProvider {
    interface Login<T> {
        suspend fun login(login: LoginRequest): T
    }

    interface Register<T> {
        suspend fun register(registerRequest: RegisterRequest): T
    }

    interface ResetPassword<T> {
        suspend fun resetPassword(email: ResetPasswordRequest): T
    }

    interface AuthFirebase<T> {
        suspend fun isUserLogged(): T
        suspend fun logout(): T
    }
}