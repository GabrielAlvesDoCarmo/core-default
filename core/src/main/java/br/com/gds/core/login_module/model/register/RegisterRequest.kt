package br.com.gds.core.login_module.model.register

import br.com.gds.core.login_module.commons.User

data class RegisterRequest(
    override val email: String,
    val password: String,
) : User