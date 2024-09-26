package br.com.gds.core.login_module.model.register

import br.com.gds.core.login_module.commons.model.UserAuth

data class RegisterResponse(
    val success: Boolean,
    val message: String? = null,
    val userInfo: UserAuth? = null,
)