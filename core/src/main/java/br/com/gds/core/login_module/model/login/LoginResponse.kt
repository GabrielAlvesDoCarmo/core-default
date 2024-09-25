package br.com.gds.core.login_module.model.login

class LoginResponse {
    val success: Boolean = false
    val message: String = ""
    val user: User? = null
    val token: String = ""

    class User {
        val id: String = ""
        val name: String = ""
        val email: String = ""
    }
}
