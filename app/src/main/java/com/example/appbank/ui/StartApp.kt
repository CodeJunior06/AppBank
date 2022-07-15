package com.example.appbank.ui

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.appbank.BankApplication.Companion.prefsScanActive
import com.example.appbank.databinding.SplashActivityBinding
import com.example.appbank.intent
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import kotlin.concurrent.thread

@AndroidEntryPoint
class StartApp : AppCompatActivity() {

    private lateinit var _binding:SplashActivityBinding
    private val binding get() = _binding
    private lateinit var hour:String

    @SuppressLint("HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
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