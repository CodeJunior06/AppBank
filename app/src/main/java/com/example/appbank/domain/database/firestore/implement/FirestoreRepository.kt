package com.example.appbank.domain.database.firestore.implement

import com.example.appbank.di.FirebaseModule
import dagger.Component
import javax.inject.Singleton

interface FirestoreRepository {
     fun getDeviceInformation()
}