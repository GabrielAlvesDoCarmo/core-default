package br.com.gds.core.login_module.model.login

import br.com.gds.core.login_module.commons.model.UserAuth

data class LoginResponse(
    val success: Boolean,
    val message: String? = null,
    val userInfo: UserAuth? = null,
)