package com.example.actud213_aocheng_ye

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var textView = findViewById<TextView>(R.id.textView)
        return when (item.itemId) {
            R.id.MenuOpcionLunes -> {
                textView.text = "Lunes"
                true
            }
            R.id.MenuOpcionMartes -> {
                textView.text = "Martes"
                true
            }
            R.id.MenuOpcionMiercoles -> {
                textView.text = "Miércoles"
                true
            }
            R.id.MenuOpcionJueves -> {
                textView.text = "Jueves"
                true
            }
            R.id.MenuOpcionViernes -> {
                textView.text = "Viernes"
                true
            }
            R.id.MenuOpcionSabado -> {
                textView.text = "Sábado"
                true
                }
            R.id.MenuOpcionDomingo -> {
                textView.text = "Domingo"
                true

            }
            R.id.MenuOpcionMeses1 -> {
                textView.text = "Enero"
                true
            }
            R.id.MenuOpcionMeses2 -> {
                textView.text = "Febrero"
                true
            }
            R.id.MenuOpcionMeses3 -> {
                textView.text = "Marzo"
                true
            }
            R.id.MenuOpcionMeses4 -> {
                textView.text = "Abril"
                true
                }
            R.id.MenuOpcionMeses5 -> {
                textView.text = "Mayo"
                true
            }
            R.id.MenuOpcionMeses6 -> {
                textView.text = "Junio"
                true
            }
            R.id.MenuOpcionMeses7 -> {
                textView.text = "Julio"
                true
            }
            R.id.MenuOpcionMeses8 -> {
                textView.text = "Agosto"
                true
            }
            R.id.MenuOpcionMeses9 -> {
                textView.text = "Septiembre"
                true
                }
            R.id.MenuOpcionMeses10 -> {
                textView.text = "Octubre"
                true
            }
            R.id.MenuOpcionMeses11 -> {
                textView.text = "Noviembre"
                true
            }
            R.id.MenuOpcionMeses12 -> {
                textView.text = "Diciembre"
                true

            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}