package com.example.backet.models.dataBase
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Team(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String
    )