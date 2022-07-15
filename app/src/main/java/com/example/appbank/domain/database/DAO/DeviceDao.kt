package com.example.appbank.domain.database.DAO

import androidx.room.Dao
import androidx.room.Query
import com.example.appbank.domain.database.entities.DeviceEntity

@Dao
interface DeviceDao {

    @Query("SELECT * FROM device")
    suspend fun insertDevice(): List<DeviceEntity>
}