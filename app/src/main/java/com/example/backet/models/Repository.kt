package com.example.backet.models

import com.example.backet.models.dataBase.Match
import com.example.backet.models.dataBase.Team

object Repository {

    private lateinit var teams: MutableList<Team>
    private lateinit var matches: MutableList<Match>
    fun setMatchesDatabase() {
        this.matches = mutableListOf()
    }

    fun getMatches():List<Match> {
        return matches
    }
    fun addMatch(match: Match) {
        matches.add(match)
    }

    fun setTeamsDatabase() {
        this.teams = mutableListOf()
        teams.add(Team(0,"Зенит"))
        teams.add(Team(1, "Спартак"))
    }
    fun getTeams():List<Team> {
        return teams
    }
    fun addTeam(team: Team) {
        teams.add(team)
    }

}