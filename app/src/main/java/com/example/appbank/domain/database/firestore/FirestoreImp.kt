package com.example.appbank.domain.database.firestore

import com.example.appbank.domain.database.firestore.implement.FirestoreRepository
import com.example.appbank.domain.models.Device
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import net.pwall.json.JSONObject
import net.pwall.json.parseJSON
import javax.inject.Inject
import kotlin.reflect.full.starProjectedType

class FirestoreImp @Inject constructor(val dataBase: FirebaseFirestore) : FirestoreRepository {

    override suspend fun getDeviceInformation(): Device? {
            val responseFirebase = dataBase.collection("device_auth").get().await()
        return if (!responseFirebase.isEmpty) {
            responseFirebase.documents[0].data.toString().parseJSON(Device::class.starProjectedType) as Device
        } else
            null
        }




}

