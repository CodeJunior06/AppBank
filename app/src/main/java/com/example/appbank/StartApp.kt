package com.example.appbank

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.appbank.BankApplication.Companion.prefsScanActive
import java.util.*
import kotlin.concurrent.thread

class StartApp : AppCompatActivity() {

    private lateinit var hour:String
    @SuppressLint("HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        hour = Date().toString()
        ActivityCompat.requestPermissions(this, arrayOf( Manifest.permission.READ_PHONE_STATE), PackageManager.PERMISSION_GRANTED)
        thread {
            println(android.provider.Settings.Secure.getString(applicationContext.contentResolver, android.provider.Settings.Secure.ANDROID_ID))
            Thread.sleep(2200)
            prefsScanActive.saveSharedInit(hour)
            startActivity(intent(LoginBank::class.java))
            finish()
        }
    }
}