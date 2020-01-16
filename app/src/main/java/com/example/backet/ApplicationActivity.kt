package com.example.backet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ApplicationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create)

        var applicationButton = findViewById<Button>(R.id.applicationButton)
        var teamNameEditText = findViewById<EditText>(R.id.teamNameEditText)
        var teamEditText = findViewById<EditText>(R.id.teamEditText)



        applicationButton.setOnClickListener {
            val applicIntent = Intent(this, MainActivity::class.java)
            startActivity(applicIntent)
        }
    }
}
