package com.example.robotapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.os.Handler
import android.widget.ProgressBar

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

        val progressBar: ProgressBar = findViewById(R.id.progressBar)

        // Show the progress bar
        progressBar.visibility = View.VISIBLE


        Handler().postDelayed({

            progressBar.visibility = View.GONE

            // Navigate to page1
            val intent = Intent(this, page1::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}
