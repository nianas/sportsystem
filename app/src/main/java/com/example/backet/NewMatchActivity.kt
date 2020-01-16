package com.example.backet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NewMatchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_match)

        var teamEditText1 =findViewById<EditText>(R.id.teamEditText1)
        var teamEditText2 = findViewById<EditText>(R.id.teamEditText2)
        var timeEditText =findViewById<EditText>(R.id.timeEditText)
        var dateEditText = findViewById<EditText>(R.id.dateEditText)

        var addButton = findViewById<Button>(R.id.addButton)

        addButton.setOnClickListener {
            val addScheduleIntent = Intent(this, ScheduleActivity::class.java)

            addScheduleIntent.putExtra("team1", teamEditText1.text.toString())
            addScheduleIntent.putExtra("team2", teamEditText2.text.toString())
            addScheduleIntent.putExtra("time", timeEditText.text.toString())
            addScheduleIntent.putExtra("date", dateEditText.text.toString())

            startActivity(addScheduleIntent)
        }


    }
}
