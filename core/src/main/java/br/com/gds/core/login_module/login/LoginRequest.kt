package br.com.gds.core.login_module.login

data class LoginRequest(
    val email: String,
    val password: String
)