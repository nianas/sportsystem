package com.example.backet.models.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Team::class], version = 1)
abstract class TeamDatabase :
    RoomDatabase() {

    abstract fun teamDao(): TeamDao

}