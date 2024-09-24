package br.com.gds.core.login_module.login

interface LoginFirebase {
    suspend fun login(loginRequest : LoginRequest) : LoginResponse
}