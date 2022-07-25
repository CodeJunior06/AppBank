package com.example.appbank.model

import android.annotation.SuppressLint
import android.content.Context
import android.net.wifi.WifiManager
import android.text.format.Formatter
import androidx.appcompat.app.AppCompatActivity
import com.example.appbank.domain.database.repository.RepositorySplash
import com.example.appbank.domain.models.Device
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class ModelSplash
@Inject
constructor(@ApplicationContext context:Context, val repositorySplash: RepositorySplash) {

    private val context: Context by lazy { context }

     suspend operator fun invoke():Device{
        repositorySplash.getObjectFirestore()
        getIp()
        getIdUnique()
        println(getIp() +"" +getIdUnique())
        return Device("","")
    }

    private fun getIp(): String {
        val wifiManager = context.getSystemService(AppCompatActivity.WIFI_SERVICE) as WifiManager
        return Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
    }

    @SuppressLint("HardwareIds")
    private fun getIdUnique(): String {
        return android.provider.Settings.Secure.getString(
            context.contentResolver,
            android.provider.Settings.Secure.ANDROID_ID
        )
    }
}