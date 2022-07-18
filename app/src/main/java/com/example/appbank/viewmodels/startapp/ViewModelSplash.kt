package com.example.appbank.viewmodels.startapp

import android.annotation.SuppressLint
import android.content.Context
import android.net.wifi.WifiManager
import android.text.format.Formatter
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import com.example.appbank.base.BaseViewModel
import com.example.appbank.model.ModelSplash
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class ViewModelSplash @Inject constructor(
    private val modelSplash: ModelSplash
) : BaseViewModel() {

    val adminLogin: MutableLiveData<Boolean> = MutableLiveData()

     fun startApp() {
        modelSplash.invoke()
    }
}