package br.com.gds.core.login

interface LoginFirebase {
    suspend fun login(loginRequest : LoginRequest) : LoginResponse
}