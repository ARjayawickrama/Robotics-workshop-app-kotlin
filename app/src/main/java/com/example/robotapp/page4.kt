package com.example.robotapp

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent1 = Intent(this, Lessons::class.java)
            startActivity(intent1)
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent2 = Intent(this, Code::class.java)
            startActivity(intent2)
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent3 = Intent(this, DiagramActivity::class.java)
            startActivity(intent3)
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent4 = Intent(this, UploadActivity::class.java)
            startActivity(intent4)
        }

        val imageView20 = findViewById<ImageView>(R.id.imageView20)
        imageView20.setOnClickListener {
            val intent5 = Intent(this, ProfileActivity::class.java)
            startActivity(intent5)
        }
        val username = intent.getStringExtra("USERNAME")

        // Display the username
        val usernameTextView = findViewById<TextView>(R.id.username_text_view)
        usernameTextView.text = "Entered Username: $username"
    }
}
