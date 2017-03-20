package com.rspn.controller

import com.rspn.model.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.*
import javax.persistence.CascadeType.PERSIST

@RestController
open class TeamController {

    @Autowired
    lateinit var teamRepository: TeamRepository

    @RequestMapping(value = "/teams")
    fun getTeams(): List<Team> = teamRepository.findAll()

    @RequestMapping(value = "teams/{teamName}")
    fun getTeam(@PathVariable("teamName") teamName: String) = teamRepository.findByLocation(teamName)

}

@Entity
data class Team(
        @Id
        @GeneratedValue
        val id: Long = 0,
        val location: String = "location",
        val name: String = "name",
        @OneToMany(cascade = arrayOf(PERSIST))
        @JoinColumn(name = "teamId")
        val players: MutableList<Player> = mutableListOf())

@Entity
data class Player(
        @Id
        @GeneratedValue
        val id: Long = 0,
        val name: String = "player name",
        val position: String = "positon")

