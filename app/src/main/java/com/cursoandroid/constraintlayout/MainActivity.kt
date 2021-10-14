package com.cursoandroid.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.not
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewStart = findViewById<TextView>(R.id.textView)
        findViewById<Button>(R.id.button).setOnClickListener {
            textViewStart.visibility = View.VISIBLE
        }
    }
}