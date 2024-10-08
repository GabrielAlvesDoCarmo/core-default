package br.com.gds.core.login_module.model.login

import br.com.gds.core.login_module.commons.interfaces.User

data class LoginRequest(
    override val email: String,
    val password: String
) : User