package com.example.examen2evaluacion

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.example.examen2evaluacion.databinding.ActivityEjercicio2BActionBarBinding

class Ejercicio2_B_Action_Bar_Activity : AppCompatActivity() {

    //REALIZAR EL BINDING
    private lateinit var binding: ActivityEjercicio2BActionBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio2BActionBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //boton para volver
        binding.returnEj2A.setOnClickListener {
            //finish()
            val popupMenu = PopupMenu(this, binding.returnEj2A)
            popupMenu.inflate(R.menu.ejercicio1_action_bar)
            popupMenu.show()
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.generarPdf -> {
                        Toast.makeText(this, "PDF Generado", Toast.LENGTH_SHORT).show()
                        true
                    }

                    else -> {
                        true
                    }
                }
            }

        }

        //menu contextual. regisyto el boton returnEj2A para aplicar menu contextual
        registerForContextMenu(binding.returnEj2A)
    }

    //este codigo siempre se pone solo se cambia el nombre del menu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.colors_menu, menu)

    }


    //cambiamos el color del boton
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.redItem ->
                binding.returnEj2A.setBackgroundColor(Color.RED)

            R.id.blueItem ->
                binding.returnEj2A.setBackgroundColor(Color.BLUE)

        }
        return super.onContextItemSelected(item)
    }
}

