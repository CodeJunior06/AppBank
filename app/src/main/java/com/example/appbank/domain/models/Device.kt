package com.example.appbank.domain.models

import net.pwall.json.annotation.JSONAllowExtra
import net.pwall.json.annotation.JSONIncludeAllProperties
import net.pwall.json.annotation.JSONName


@JSONIncludeAllProperties
@JSONAllowExtra
data class Device(@JSONName("adminDevice")val adminDevice: Boolean,@JSONName("idDevice") val idDevice:String,@JSONName("ipDevice") val ipDevice:String)
