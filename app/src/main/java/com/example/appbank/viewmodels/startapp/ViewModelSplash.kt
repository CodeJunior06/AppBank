package com.example.appbank.viewmodels.startapp

import androidx.lifecycle.ViewModel
import com.example.appbank.base.BankApplication.Companion.prefsScanActive
import com.example.appbank.model.ModelSplash
import java.util.*
import javax.inject.Inject

class ViewModelSplash @Inject constructor(modelSplash: ModelSplash) : ViewModel(){

    private lateinit var hour:String

    fun startApp(){
        hour = Date().toString()
        prefsScanActive.saveSharedInit(hour)
    }



}