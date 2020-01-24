package com.example.backet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.backet.models.Repository
import com.example.backet.models.dataBase.Team

class TeamListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_list)
        val output = findViewById<TextView>(R.id.teamList)
        var teamList = ""
        var teams: List<Team> = Repository.getTeams()
        teams.forEach {
            teamList+= it.name + "\n"
        }
        output.text = teamList
    }
}
