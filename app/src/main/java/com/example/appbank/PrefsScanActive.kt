package com.example.appbank

import android.content.Context

class PrefsScanActive(context:Context) {

    internal val SHARED_NAME_PREF = "ScanActive"
    internal val SHARED_INIT = "init_signIn"
    internal val SHARED_FINALIZE = "finalize_logOut"

    val storage = context.getSharedPreferences(SHARED_NAME_PREF,0)

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