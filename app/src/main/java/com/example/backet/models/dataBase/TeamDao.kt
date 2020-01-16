package com.example.backet.models.dataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TeamDao {
    @Query("SELECT * FROM `Team`")
    fun getAllTeams():List<Team>

    @Insert
    fun insertTeam(
        team: Team
    )

    @Update
    fun updateTeam(
        team: Team
    )
}