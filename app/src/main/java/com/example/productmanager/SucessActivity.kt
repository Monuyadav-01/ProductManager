package com.example.productmanager

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialog
import com.example.productmanager.databinding.ActivitySucessBinding

class SucessActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySucessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySucessBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.addNewItemButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}