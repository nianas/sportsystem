package com.example.backet.models.dataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MatchDao {
    @Query("SELECT * FROM `Match`")
    fun getAllMatches():List<Match>

    @Insert
    fun insertMatch(
        match: Match
    )

    @Update
    fun updateMatch(
        match: Match
    )
}