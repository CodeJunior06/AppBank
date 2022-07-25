package com.example.appbank.domain.database.repository

import com.example.appbank.domain.database.firestore.FirestoreImp
import javax.inject.Inject


class RepositorySplash  @Inject constructor( private val firestoreImp: FirestoreImp){

    suspend fun getObjectFirestore(){
        firestoreImp.getDeviceInformation()
    }
}