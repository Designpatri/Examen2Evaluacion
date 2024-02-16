package com.example.examen2evaluacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.examen2evaluacion.databinding.ActivityEjercicio2BActionBarBinding

class Ejercicio2_B_Action_Bar_Activity : AppCompatActivity() {

    //REALIZAR EL BINDING
    private lateinit var binding: ActivityEjercicio2BActionBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio2BActionBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}

