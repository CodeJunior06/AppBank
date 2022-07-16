package com.example.appbank.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.appbank.databinding.LoginActivityBinding
import com.example.appbank.viewmodels.login.ViewModelLogin
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginBank : AppCompatActivity() {

    private  val  viewModelLogin: ViewModelLogin by viewModels()
    private lateinit var  _binding:LoginActivityBinding
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}