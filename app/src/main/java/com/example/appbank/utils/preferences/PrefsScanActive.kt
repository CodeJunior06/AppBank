package com.example.appbank.utils.preferences

import android.content.Context

class PrefsScanActive(context:Context) {

    private val SHARED_NAME_PREF = "ScanActive"
    private val SHARED_INIT = "init_signIn"
    private val SHARED_FINALIZE = "finalize_logOut"

    private val storage = context.getSharedPreferences(SHARED_NAME_PREF,0)

    fun saveSharedInit(date:String){
        storage.edit().putString(SHARED_INIT,date).apply()
    }

    fun getSharedInit(): String{
        return storage.getString(SHARED_INIT,"")!!
    }

    fun saveSharedFinalize(date: String){
        storage.edit().putString(SHARED_FINALIZE,date).apply()
    }

    fun getSharedFinalize():String{
        return storage.getString(SHARED_FINALIZE,"")!!
    }
}