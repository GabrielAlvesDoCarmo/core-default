package br.com.gds.core.login_module.register

interface RegisterFirebase {
    suspend fun register(email : String, password : String)
}