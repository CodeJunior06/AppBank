package com.example.appbank.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.appbank.base.BaseViewModel
import com.example.appbank.databinding.SplashActivityBinding
import com.example.appbank.utils.extension.intentLogin
import com.example.appbank.viewmodels.startapp.ViewModelSplash
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class StartApp : AppCompatActivity() {

    private lateinit var _binding: SplashActivityBinding
    private val binding get() = _binding

    private val viewModelStart: ViewModelSplash by viewModels()

    @SuppressLint("HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModelStart.startApp()

        viewModelStart.navegation.observe(this) {
            when (it!!) {
                BaseViewModel.NAVIGATION.NAV_EMPTY -> {
                   /* startActivity(intentLogin(LoginBank::class.java,viewModelStart.adminLogin.value!!))
                    finish()*/
                }

                else -> {}

            }


            /*       ActivityCompat.requestPermissions(this, arrayOf( Manifest.permission.READ_PHONE_STATE), PackageManager.PERMISSION_GRANTED)
                   thread {
                       val wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
                       val ipAddress = Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
                       println("IP: $ipAddress")
                       println(android.provider.Settings.Secure.getString(applicationContext.contentResolver, android.provider.Settings.Secure.ANDROID_ID))
                       Thread.sleep(2200)
                       startActivity(intent(LoginBank::class.java))
                       finish()
                   }*/
        }

        Thread.sleep(6000)
        startActivity(Intent(this,LoginBank::class.java))
        finish()
    }

}