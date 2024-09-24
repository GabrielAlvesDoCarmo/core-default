package br.com.gds.core.login

interface LoginFirebase {
    suspend fun login(email: String, password: String): LoginResponse
}