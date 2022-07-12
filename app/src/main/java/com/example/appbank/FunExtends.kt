package com.example.appbank

import android.app.Activity
import android.content.Intent

fun Activity.intent(classIntent:Class<*>?) : Intent{
    return Intent(this,classIntent)
}
