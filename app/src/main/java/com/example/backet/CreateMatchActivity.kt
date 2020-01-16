package com.example.backet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_standings.*

class CreateMatchActivity : AppCompatActivity() {




    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_match)

        var team1EditText = this!!.findViewById<EditText>(R.id.team1EditText)!!
        var team2EditText = this!!.findViewById<EditText>(R.id.team2EditText)
        var scoreEditText = this!!.findViewById<EditText>(R.id.scoreEditText)
        var createButton = this.findViewById<Button>(R.id.createButton)!!


        createButton.setOnClickListener {
            val standingIntent = Intent(this, StandingsActivity::class.java)

            standingIntent.putExtra("team1", team1EditText.text.toString())
            standingIntent.putExtra("team2", team2EditText.text.toString())
            standingIntent.putExtra("score", scoreEditText.text.toString())
            startActivity(standingIntent)
        }
    }


}
