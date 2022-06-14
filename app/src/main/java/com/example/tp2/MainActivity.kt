package com.example.tp2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var number1: EditText
    lateinit var number2: EditText
    lateinit var string: String
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.btn1)
        button2 = findViewById(R.id.btn2)
        button3 = findViewById(R.id.btn3)
        button4 = findViewById(R.id.btn4)
        number1 = findViewById(R.id.editNumber1)
        number2 = findViewById(R.id.editNumber2)
        textView = findViewById(R.id.textView)

        // Add
        button1.setOnClickListener {
            var double1: Double = number1.text.toString().toDouble()
            var double2: Double = number2.text.toString().toDouble()
            var result: Double = double1 + double2
            textView.text = result.toString()
        }

        // Substraction
        button2.setOnClickListener {
            var double1: Double = number1.text.toString().toDouble()
            var double2: Double = number2.text.toString().toDouble()
            var result: Double = double1 - double2
            textView.text = result.toString()
        }

        // Division
        button3.setOnClickListener {
            var double1: Double = number1.text.toString().toDouble()
            var double2: Double = number2.text.toString().toDouble()
            var result: Double = double1 / double2
            textView.text = result.toString()
        }

        // Multiply
        button4.setOnClickListener {
            var double1: Double = number1.text.toString().toDouble()
            var double2: Double = number2.text.toString().toDouble()
            var result: Double = double1 * double2
            textView.text = result.toString()
        }


    }


}