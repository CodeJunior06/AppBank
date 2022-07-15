package com.example.appbank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appbank.databinding.LoginActivityBinding

class LoginBank : AppCompatActivity() {

    private lateinit var  _binding:LoginActivityBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}