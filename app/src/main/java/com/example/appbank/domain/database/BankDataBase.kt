package com.example.appbank.domain.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appbank.domain.database.DAO.DeviceDao
import com.example.appbank.domain.database.entities.DeviceEntity

@Database(entities = [DeviceEntity::class],version = 1,exportSchema = false)
 abstract class BankDataBase:RoomDatabase() {

    abstract fun instanceDeviceDAO() : DeviceDao
}