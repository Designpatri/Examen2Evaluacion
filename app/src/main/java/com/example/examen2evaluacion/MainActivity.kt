package com.example.examen2evaluacion

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //CARGAR EL MENU EN LA CLASE DONDE QUEREMOS QUE SE VEA
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    //Para saber cuándo el usuario presiona alguna opción (item), se hace lo siguiente:
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.nuevo -> {
                //Toast.makeText(this, "Pulsado nuevo", Toast.LENGTH_SHORT).show()
                val openEj1Activity = Intent(this, Ejercicio1_Action_Bar_Activity::class.java)
                startActivity(openEj1Activity)
                true
            }

            R.id.eliminar -> {
                Toast.makeText(this, "Pulsado eliminar", Toast.LENGTH_SHORT).show()
                true
            }

            else ->
                super.onOptionsItemSelected(item)
        }

        // Se puede hacer igual usando varios if..else if..else
        //if (item.itemId == R.id.nuevo) {
        //    Toast.makeText(this, "Pulsado nuevo", Toast.LENGTH_SHORT).show()
        //    return true

        //} else if (item.itemId == R.id.eliminar) {
        //    Toast.makeText(this, "Pulsado eliminar", Toast.LENGTH_SHORT).show()
        //    return true
        //} else {
        //    return super.onOptionsItemSelected(item)

    }
}
