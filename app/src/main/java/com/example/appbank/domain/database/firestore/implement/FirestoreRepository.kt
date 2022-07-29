package com.example.appbank.domain.database.firestore.implement

import com.example.appbank.domain.models.Device


interface FirestoreRepository {
     suspend fun getDeviceInformation(): Device?
}