package com.example.backet.models.dataBase

data class Match(
    val id: Int,
    val team1Id: Int,
    val team2Id: Int,
    val team1Score: Int,
    val team2Score: Int
)