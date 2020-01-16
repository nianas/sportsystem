package com.example.backet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ScheduleActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)


        var scheduleTextView0: TextView = findViewById(R.id.scheduleTextView0)


        var newMatchButton = findViewById<Button>(R.id.newMatchButton)
        var exitButton = findViewById<Button>(R.id.exitButton)

        var team1 = intent.getStringExtra("team1")
        var team2 = intent.getStringExtra("team2")
        var time = intent.getStringExtra("time")
        var date = intent.getStringExtra("date")
        var dataSet= DataSet()


        dataSet.addSchedule("\n"+ team1+ " - " + team2 + " "+ date + " " + time)
        scheduleTextView0.text = dataSet.schedu

        newMatchButton.setOnClickListener {
            val newMatchIntent = Intent(this, NewMatchActivity::class.java)
            startActivity(newMatchIntent)
        }

        exitButton.setOnClickListener {
            val exitIntent = Intent(this, MainActivity::class.java)
            startActivity(exitIntent)
        }

    }



}
