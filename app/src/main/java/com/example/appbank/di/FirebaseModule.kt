package com.example.appbank.di

import com.example.appbank.domain.database.firestore.FirestoreImp
import com.example.appbank.domain.database.firestore.implement.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object FirebaseModule {

    @Provides
    @Singleton
    fun provideFirestoreInstance():FirebaseFirestore{
        return FirebaseFirestore.getInstance()
    }

    @Provides
    @Singleton
    fun provideInstanceInject(dataBase:FirebaseFirestore): FirestoreRepository {
        return FirestoreImp(dataBase)
    }
}