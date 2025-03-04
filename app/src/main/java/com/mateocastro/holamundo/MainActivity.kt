package com.mateocastro.holamundo




import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.editTextNumber1)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val resultado = findViewById<TextView>(R.id.textViewResultado)

        val btnSuma = findViewById<Button>(R.id.btnSuma)
        val btnResta = findViewById<Button>(R.id.btnResta)
        val btnMultiplicacion = findViewById<Button>(R.id.btnMultiplicacion)
        val btnDivision = findViewById<Button>(R.id.btnDivision)

        btnSuma.setOnClickListener {
            val res = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            resultado.text = "Resultado: $res"
        }

        btnResta.setOnClickListener {
            val res = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            resultado.text = "Resultado: $res"
        }

        btnMultiplicacion.setOnClickListener {
            val res = num1.text.toString().toDouble() * num2.text.toString().toDouble()
            resultado.text = "Resultado: $res"
        }

        btnDivision.setOnClickListener {
            val num2Value = num2.text.toString().toDouble()
            if (num2Value != 0.0) {
                val res = num1.text.toString().toDouble() / num2Value
                resultado.text = "Resultado: $res"
            } else {
                resultado.text = "Error: División por cero"
            }
        }
    }
}

