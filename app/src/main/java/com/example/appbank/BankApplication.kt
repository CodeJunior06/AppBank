package com.example.appbank

import android.app.Application
import com.example.appbank.utils.preferences.PrefsScanActive
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BankApplication: Application() {
    companion object{
        lateinit var prefsScanActive: PrefsScanActive
    }
    override fun onCreate() {
        super.onCreate()
        prefsScanActive = PrefsScanActive(applicationContext)
    }
}