package com.example.appbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appbank.BankApplication.Companion.prefsScanActive
import java.util.*
import kotlin.concurrent.thread

class StartApp : AppCompatActivity() {

     lateinit var hour:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        hour = Date().toString()
        thread {
            Thread.sleep(2000)
            prefsScanActive.saveSharedInit(hour)
            intent(LoginBank::class.javaPrimitiveType)
            finish()
        }
    }
}