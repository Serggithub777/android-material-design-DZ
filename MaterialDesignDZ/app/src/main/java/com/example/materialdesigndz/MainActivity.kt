package com.example.materialdesigndz

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {
    private var nTextInputLayout: TextInputLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nTextInputLayout = findViewById(R.id.name_text_input_layout)
        showError()


    }

    private fun showError() {
       nTextInputLayout?.error = "Error input"
    }
}