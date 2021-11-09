package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.EditText
import androidx.appcompat.view.SupportActionModeWrapper

class MainActivity : AppCompatActivity() {


    lateinit var clear_btn :android.widget.Button
    lateinit var btn_1 :android.widget.Button
    lateinit var btn_2 :android.widget.Button
    lateinit var btn_3 :android.widget.Button
    lateinit var btn_4 :android.widget.Button
    lateinit var btn_5 :android.widget.Button
    lateinit var btn_6 :android.widget.Button
    lateinit var btn_7 :android.widget.Button
    lateinit var btn_8 :android.widget.Button
    lateinit var btn_9 :android.widget.Button
    lateinit var btn_0 :android.widget.Button
    lateinit var btn_00 :android.widget.Button
    lateinit var btn_percent  :android.widget.Button
    lateinit var btn_divide :android.widget.Button
    lateinit var btn_backspace :android.widget.Button
    lateinit var btn_multiply:android.widget.Button
    lateinit var btn_plus :android.widget.Button
    lateinit var btn_equal :android.widget.Button
    lateinit var btn_point :android.widget.Button
    lateinit var btn_minus :android.widget.Button
    lateinit var inputtext: EditText
    lateinit var resulttext :EditText
    var check = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)
        clear_btn = findViewById(R.id.clear_btn)
        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)
        btn_3 = findViewById(R.id.btn_3)
        btn_4 = findViewById(R.id.btn_4)
        btn_5 = findViewById(R.id.btn_5)
        btn_6 = findViewById(R.id.btn_6)
        btn_7 = findViewById(R.id.btn_7)
        btn_8 = findViewById(R.id.btn_8)
        btn_9 = findViewById(R.id.btn_9)
        btn_0 = findViewById(R.id.btn_0)
        btn_00 = findViewById(R.id.btn_00)
        btn_percent = findViewById(R.id.percent)
        btn_divide = findViewById(R.id.divide)
        btn_backspace = findViewById(R.id.btn_backspace)
        btn_multiply = findViewById(R.id.btn_multiply)
        btn_plus = findViewById(R.id.btn_plus)
        btn_equal = findViewById(R.id.btn_equal)
        btn_point = findViewById(R.id.btn_point)
        btn_minus = findViewById(R.id.btn_minus)
        inputtext = findViewById(R.id.input)
        resulttext = findViewById(R.id.result)
        inputtext.movementMethod=ScrollingMovementMethod()
        inputtext.setActivated(true)
    }
}