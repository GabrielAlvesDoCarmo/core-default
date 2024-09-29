package br.com.gds.core

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage

object FirebaseInstances {
    fun getAuth(): FirebaseAuth = FirebaseAuth.getInstance()
    fun getStorage(): FirebaseStorage = FirebaseStorage.getInstance()
    fun getDatabase(): FirebaseDatabase = FirebaseDatabase.getInstance()
    fun getFirestore(): FirebaseFirestore = FirebaseFirestore.getInstance()

}