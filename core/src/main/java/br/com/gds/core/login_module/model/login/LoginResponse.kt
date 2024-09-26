package br.com.gds.core.login_module.model.login

data class LoginResponse(
    val success: Boolean,
    val message: String? = null,
    val additionalInfo: Any? = null,
)