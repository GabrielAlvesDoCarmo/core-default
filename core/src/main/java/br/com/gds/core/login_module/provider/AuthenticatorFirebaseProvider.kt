package br.com.gds.core.login_module.provider

import br.com.gds.core.login_module.model.login.LoginRequest
import br.com.gds.core.login_module.model.register.RegisterRequest
import br.com.gds.core.login_module.model.resetpassword.ResetPasswordRequest

sealed interface AuthenticatorFirebaseProvider {
    interface Login<T> {
        suspend fun login(login: LoginRequest): Result<T>
    }

    interface Register<T> {
        suspend fun register(registerRequest: RegisterRequest): Result<T>
    }

    interface ResetPassword <T> {
        suspend fun resetPassword(email: ResetPasswordRequest): Result<T>
    }

    interface AuthFirebase <T> {
        suspend fun isUserLogged():  Result<T>
        suspend fun logout():  Result<T>
    }
}