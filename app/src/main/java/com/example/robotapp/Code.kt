package com.example.robotapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_code)

        // Adjusts the padding of the main view based on system bars insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Back button functionality
        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // This will close the current activity and take the user back to the previous activity
        }

        // Adding functionality to navigate to Codes1 activity when each FrameLayout is clicked
        val roversMarsFrame = findViewById<FrameLayout>(R.id.frameLayout1)
        roversMarsFrame.setOnClickListener {
            val intent = Intent(this, Codes1::class.java)
            startActivity(intent)
        }

        val roversCare = findViewById<FrameLayout>(R.id.frameLayout2)
        roversCare.setOnClickListener {
            val intent = Intent(this, Codes1::class.java)
            startActivity(intent)
        }

        val robot = findViewById<FrameLayout>(R.id.frameLayout4)
        robot.setOnClickListener {
            val intent = Intent(this, Codes1::class.java)
            startActivity(intent)
        }

        val car = findViewById<FrameLayout>(R.id.frameLayout5)
        car.setOnClickListener {
            val intent = Intent(this, Codes1::class.java)
            startActivity(intent)
        }

        val rover = findViewById<FrameLayout>(R.id.frameLayout6)
        rover.setOnClickListener {
            val intent = Intent(this, Codes1::class.java)
            startActivity(intent)
        }
    }
}
