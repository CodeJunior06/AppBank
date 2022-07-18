package com.example.appbank.domain.database.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.appbank.domain.database.entities.DeviceEntity

@Dao
interface DeviceDao {

    @Insert(entity = DeviceEntity::class, onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDevice(entity: DeviceEntity)
}