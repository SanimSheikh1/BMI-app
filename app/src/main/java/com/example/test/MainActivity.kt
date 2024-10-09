package com.example.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {

            val height = binding.height.text.toString().toDouble() / 100
            val weight = binding.weight.text.toString().toDouble()

            val bmi = weight / (height * height)

            binding.SB.text = String.format("BMI is : %.2f",bmi)

            binding.Sw.text = when(bmi){

                in 0.0..18.4 -> "Under Weight"
                in 18.5..25.5 -> "Perfect"
                in 25.6..30.5 -> "Over Weight"

                else -> "Obesity"
            }

        }
    }
}