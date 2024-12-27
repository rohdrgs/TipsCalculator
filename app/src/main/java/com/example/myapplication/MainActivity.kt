package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


            binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->

                println("Rodrigo Opiton one:$isChecked")
            }

            binding.rbOptionTwo.setOnCheckedChangeListener { _, isCheked ->

                println("Rodrigo Opition two:$isCheked")
            }

            binding.rbOptionThree.setOnCheckedChangeListener { _, isCheked ->

                println("Rodrigo Opition Three$isCheked")
            }




            binding.btnClean.setOnClickListener {
                println ( "Rodrigo" + binding.valorConta.text )
                println ("Assunção" + binding.tilNumPeople.text)
            }


















        }
    }
