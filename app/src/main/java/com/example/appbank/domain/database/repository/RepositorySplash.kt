package com.example.appbank.domain.database.repository

import com.example.appbank.domain.database.firestore.FirestoreImp
import javax.inject.Inject


class RepositorySplash  @Inject constructor( val firestoreImp: FirestoreImp){

    fun getObjectFirestore(){
        firestoreImp.getDeviceInformation()
    }
}