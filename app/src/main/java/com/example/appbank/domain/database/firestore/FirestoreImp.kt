package com.example.appbank.domain.database.firestore

import android.util.Log
import com.example.appbank.domain.database.firestore.implement.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class FirestoreImp @Inject constructor(val dataBase: FirebaseFirestore) : FirestoreRepository {

    override  suspend fun getDeviceInformation() {
        dataBase.collection("device_auth").get().addOnSuccessListener { result ->
            for (document in result) {
                println(document.data["ipDevice"])
                Log.d("TAG", "${document.id} => ${document.data}")
                println("FIREBASEEE ${document.id} => ${document.data}")
            }
        }
            .addOnFailureListener { exception ->
                Log.w("TAG", "Error getting documents.", exception)
            }
    }


}

