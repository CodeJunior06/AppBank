package com.example.appbank.domain.database.firestore

import com.example.appbank.domain.database.firestore.implement.FirestoreRepository
import com.example.appbank.domain.models.Device
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObjects
import kotlinx.coroutines.tasks.await
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import javax.inject.Inject


class FirestoreImp @Inject constructor(val dataBase: FirebaseFirestore) : FirestoreRepository {

    override suspend fun getDeviceInformation(): Device? {
            val responseFirebase = dataBase.collection("device_auth").get().await()
        return if (!responseFirebase.isEmpty) {
            null
           // Json.decodeFromString<Device>( responseFirebase.documents[0].data.toString())
        } else
            null
        }
}

