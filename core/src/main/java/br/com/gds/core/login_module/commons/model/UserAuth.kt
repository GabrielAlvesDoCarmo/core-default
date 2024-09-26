package br.com.gds.core.login_module.commons.model

import android.net.Uri

data class UserAuth(
    val uid: String? = null,
    val name: String? = null,
    val email: String? = null,
    val number: String? = null,
    val photoUrl: Uri? = null,
)