package com.example.appbank

import android.app.Application

class BankApplication: Application() {
    companion object{
        lateinit var prefsScanActive: PrefsScanActive
    }
    override fun onCreate() {
        super.onCreate()
        prefsScanActive = PrefsScanActive(applicationContext)
    }
}