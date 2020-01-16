package com.example.backet.models

import com.example.backet.models.dataBase.Match
import com.example.backet.models.dataBase.MatchDatabase
import com.example.backet.models.dataBase.Team
import com.example.backet.models.dataBase.TeamDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object Repository {

    const val MATCH_DATABASE_NAME = "matchDatabase"
    const val TEAM_DATABASE_NAME = "teamDatatbase"

    private lateinit var matchesDatabase: MatchDatabase
    private lateinit var teamsDatabase: TeamDatabase

    fun setMatchesDatabase(
        matchDatabase: MatchDatabase
    ) {
        this.matchesDatabase = matchDatabase
    }

    fun getMatches(
        onGetMatches: (matches: List<Match>) -> Unit
    ) {
        GlobalScope.launch(Dispatchers.Main) {
            onGetMatches(
                withContext(Dispatchers.IO) {
                    matchesDatabase.matchDao().getAllMatches()
            })
        }
    }
    fun addMatch(match: Match) {
        GlobalScope.launch(Dispatchers.IO) {
            matchesDatabase.matchDao().insertMatch(match)
        }
    }

    fun setTeamsDatabase(
        teamsDatabase: TeamDatabase
    ) {
        this.teamsDatabase = teamsDatabase
    }

    fun getTeams(
        onGetTeams: (teams: List<Team>) -> Unit)
    {
            GlobalScope.launch(Dispatchers.Main) {
                onGetTeams(
                    withContext(Dispatchers.IO) {
                        teamsDatabase.teamDao().getAllTeams()
                    }
                )
            }
    }
    fun insertTeam(team: Team) {
        GlobalScope.launch(Dispatchers.IO) {
            teamsDatabase.teamDao().insertTeam(team)
        }
    }

}