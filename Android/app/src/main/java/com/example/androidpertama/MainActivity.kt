package com.example.androidpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.btn1) as Button

        button.setOnClickListener {
            // lakukan apa saja!
            Toast.makeText(this@MainActivity, "Tombol berhasil di klik!", Toast.LENGTH_SHORT).show()
        }
    }
}
