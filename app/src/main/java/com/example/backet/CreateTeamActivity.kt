package com.example.backet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.backet.models.Repository
import com.example.backet.models.dataBase.Team

class CreateTeamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_team)
        val teamName = findViewById<EditText>(R.id.teamName)
        val addButton = findViewById<Button>(R.id.createTeamButton)


        addButton.setOnClickListener {
            Repository.addTeam(Team(0, teamName.text.toString()))
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }
    }
}
