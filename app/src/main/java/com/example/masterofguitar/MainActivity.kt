package com.example.masterofguitar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val eTnombre = findViewById<EditText>(R.id.eTnombre)
        val buttonCredit = findViewById<Button>(R.id.buttonCredit)
        buttonCredit.setOnClickListener {
            // Crear el intent
            val intent = Intent(this@MainActivity, CreditActivity::class.java)

            // Tomar el valor del cuadro de texto
            val nombre = eTnombre.text.toString()
            intent.putExtra("nombre", nombre)

            // Iniciar la nueva actividad
            startActivity(intent)
        }

    }

}