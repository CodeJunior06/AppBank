package com.example.appbank.di

import android.content.Context
import androidx.room.Room
import com.example.appbank.domain.database.BankDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val NAME_DATA_BASE = "bank_database"


    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) = Room.databaseBuilder(context,
        BankDataBase::class.java,
        NAME_DATA_BASE
    ).build()

    @Singleton
    @Provides
    fun provideDeviceDAO(dataBase: BankDataBase) = dataBase.instanceDeviceDAO()

}