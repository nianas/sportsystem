package com.example.backet.models.dataBase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Match(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val team1Id: Int,
    val team2Id: Int,
    val team1Score: Int,
    val team2Score: Int
)