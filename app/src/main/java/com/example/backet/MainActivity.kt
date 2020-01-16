package com.example.backet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.room.Room
import com.example.backet.models.Repository
import com.example.backet.models.dataBase.MatchDatabase
import com.example.backet.models.dataBase.TeamDatabase

class MainActivity : AppCompatActivity() {
   // var standings: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Repository.setTeamsDatabase(
            Room.databaseBuilder(
                applicationContext,
                TeamDatabase::class.java,
                Repository.TEAM_DATABASE_NAME
            ).build()
        )
        Repository.setMatchesDatabase(
            Room.databaseBuilder(
                applicationContext,
                MatchDatabase::class.java,
                Repository.MATCH_DATABASE_NAME
            ).build()
        )
        var createMatchButton = findViewById<Button>(R.id.createMatchButton)
        var application = findViewById<Button>(R.id.application)
        var scheduleButton = findViewById<Button>(R.id.scheduleButton)
        var standingsButton = findViewById<Button>(R.id.stadlingButton)
        val createTeamButton = findViewById<Button>(R.id.createTeamButton)
        val teamListButton = findViewById<Button>(R.id.teamListButton)





        createMatchButton.setOnClickListener{
            val createMatchIntent = Intent(this, CreateMatchActivity :: class.java)
            startActivity(createMatchIntent)
        }
        scheduleButton.setOnClickListener{
            val scheduleIntent = Intent(this, ScheduleActivity::class.java)
            startActivity(scheduleIntent)
        }

        application.setOnClickListener{
            val applicationIntent = Intent(this, ApplicationActivity::class.java)
            startActivity(applicationIntent)
        }

        standingsButton.setOnClickListener {
            val standingsIntent = Intent(this, StandingsActivity:: class.java)

            //standingsIntent.putExtra("standings", standings)
            startActivity(standingsIntent)
            //this.standings = intent.getStringExtra("standings")
        }

        createTeamButton.setOnClickListener{
            startActivity(Intent(this, CreateTeamActivity::class.java))
        }
        teamListButton.setOnClickListener{
            startActivity(Intent(this, TeamListActivity::class.java))
        }




    }
}
