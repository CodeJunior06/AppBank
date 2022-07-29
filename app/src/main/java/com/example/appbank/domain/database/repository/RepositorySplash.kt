package com.example.appbank.domain.database.repository

import com.example.appbank.domain.database.firestore.FirestoreImp
import com.example.appbank.domain.models.Device
import javax.inject.Inject


class RepositorySplash  @Inject constructor( private val firestoreImp: FirestoreImp){

    suspend fun getObjectFirestore() : Device? {
       return firestoreImp.getDeviceInformation()

    }
}