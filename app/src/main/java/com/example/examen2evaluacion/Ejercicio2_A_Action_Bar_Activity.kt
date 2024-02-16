package com.example.examen2evaluacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.examen2evaluacion.databinding.ActivityEjercicio1ActionBarBinding
import com.example.examen2evaluacion.databinding.ActivityEjercicio2AActionBarBinding

class Ejercicio2_A_Action_Bar_Activity : AppCompatActivity() {

    //REALIZAR EL BINDING
    private lateinit var binding: ActivityEjercicio2AActionBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio2AActionBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarEj2a)
    }

    //CARGAR EL MENU EN LA CLASE DONDE QUEREMOS QUE SE VEA
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ejercicio2_a_action_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.return_ej2_a -> {
                Toast.makeText(this, "Pulsado nuevo", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.return_ej2_a -> {
                Toast.makeText(this, "Pulsado eliminar", Toast.LENGTH_SHORT).show()
                true
            }

            else ->
                super.onOptionsItemSelected(item)
        }

    }

}




