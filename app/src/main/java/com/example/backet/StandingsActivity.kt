package com.example.backet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.backet.models.Repository
import kotlinx.android.synthetic.main.activity_standings.*

class StandingsActivity : AppCompatActivity() {
    private lateinit var standings: String
    override fun onCreate(savedInstanceState: Bundle?) {
        val teams = Repository.getTeams()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standings)

        var standingsTextView:TextView = this.findViewById(R.id.standingsTextView)
        var button = findViewById<Button>(R.id.button)

        var team1 = intent.getStringExtra("team1")
        var team2 = intent.getStringExtra("team2")
        var score = intent.getStringExtra("score")
        var dataSet = DataSet()

        standings = "\n$team1- $team2 - $score"
        dataSet.addStanding(standings)



        standingsTextView.text = dataSet.stand



        button.setOnClickListener {
            val mainIntent = Intent(this, MainActivity::class.java)

           //mainIntent.putExtra("standings", standings)
            startActivity(mainIntent)

        }
    }



}
