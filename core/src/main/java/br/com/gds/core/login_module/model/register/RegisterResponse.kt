package br.com.gds.core.login_module.model.register

data class RegisterResponse(
    val success: Boolean,
    val message: String? = null,
    val additionalInfo: Any? = null,
)