package com.example.appbank.utils.extension

import android.app.Activity
import android.content.Intent

fun Activity.intentLogin(classIntent:Class<*>?,adminlogin:Boolean) : Intent{
    return Intent(this,classIntent).putExtra("admin_login",adminlogin)
}
