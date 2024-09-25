package br.com.gds.core.login_module.model.resetpassword

import br.com.gds.core.login_module.commons.User

data class ResetPasswordRequest (
    override val email: String
) : User