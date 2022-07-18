package com.example.appbank.domain.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "device")
data class DeviceEntity(@PrimaryKey(autoGenerate = false) @ColumnInfo(name = "idDevice") val idDevice:String,@ColumnInfo(name = "ipDevice") val ipDevice:String
)
