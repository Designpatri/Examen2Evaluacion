package com.example.examen2evaluacion

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.example.examen2evaluacion.databinding.ActivityEjercicio1ActionBarBinding

class Ejercicio1_Action_Bar_Activity : AppCompatActivity() {

    //REALIZAMOS EL BINDING
    private lateinit var binding: ActivityEjercicio1ActionBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1ActionBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //CARGAMOS EL MENU EN LA CLASE DONDE QUEREMOS QUE SE VEA
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ejercicio1_action_bar, menu)
        return super.onCreateOptionsMenu(menu)

    }

}
