package com.example.project_pertama

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project_pertama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handleuser()
    }

    private fun handleuser(){
        binding.profileDescription.setOnClickListener{
            var builder = AlertDialog.Builder(this)
            builder.setTitle("Tentang Saya")
            builder.setMessage("Tentang Saya: Saya Zhafirah Naswa Naufariza, seorang pelajar di SMKN 24 Jakarta")
            builder.setPositiveButton("OK"){dialog, _->
                dialog.dismiss()
            }

            val dialog = builder.create()
            dialog.show()
            Toast.makeText(applicationContext, "Tentang Saya", Toast.LENGTH_LONG).show()
        }

        binding.logoutButton.setOnClickListener(){
            finishAffinity()
        }

        binding.btnCalculator.setOnClickListener {
            val intent = Intent(this, Calculator::class.java)
            startActivity(intent)
        }
    }
}