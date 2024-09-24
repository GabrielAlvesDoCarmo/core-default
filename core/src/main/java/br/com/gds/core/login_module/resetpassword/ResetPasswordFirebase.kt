package br.com.gds.core.login_module.resetpassword

interface ResetPasswordFirebase {
    suspend fun resetPassword(email : String)
}