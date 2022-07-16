package com.example.appbank.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.appbank.databinding.SplashActivityBinding
import com.example.appbank.intent
import com.example.appbank.viewmodels.startapp.ViewModelSplash
import dagger.hilt.android.AndroidEntryPoint
import kotlin.concurrent.thread

@AndroidEntryPoint
class StartApp : AppCompatActivity() {

    private lateinit var _binding:SplashActivityBinding
    private val binding get() = _binding

    private val viewModelStart:ViewModelSplash by viewModels()


    @SuppressLint("HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModelStart.startApp()
        //ActivityCompat.requestPermissions(this, arrayOf( Manifest.permission.READ_PHONE_STATE), PackageManager.PERMISSION_GRANTED)
        thread {
            println(android.provider.Settings.Secure.getString(applicationContext.contentResolver, android.provider.Settings.Secure.ANDROID_ID))
            Thread.sleep(2200)
            startActivity(intent(LoginBank::class.java))
            finish()
        }
    }
}