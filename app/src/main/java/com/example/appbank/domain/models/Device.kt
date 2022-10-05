package com.example.appbank.domain.models

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
@Keep
@Serializable
data class Device(@SerialName("adminDevice")val adminDevice: Boolean,@SerialName("idDevice") val idDevice:String,@SerialName("ipDevice") val ipDevice:String) :java.io.Serializable
