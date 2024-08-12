package com.example.robotapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserNameActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_name2)

        // Set up the view insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find views by ID
        val usernameInput = findViewById<EditText>(R.id.username_input)
        val saveButton = findViewById<Button>(R.id.save_button)

        // Set up button click listener
        saveButton.setOnClickListener {
            val username = usernameInput.text.toString()
            // Start Page4 and pass the username
            val intent = Intent(this, page4::class.java).apply {
                putExtra("USERNAME", username)
            }
            startActivity(intent)
        }
    }
}
