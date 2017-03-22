package com.rspn

import com.rspn.controller.Player
import com.rspn.controller.Team
import com.rspn.model.TeamRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Lab1Application {
    @Bean
    open fun inti(teamRepository: TeamRepository) = CommandLineRunner {
        val chinesePlayers: Player = Player(name = "Xixi", position = "Defense")
        val dutchPlayers: Player = Player(name = "Juan Van der Paal", position = "Striker")
        teamRepository.save(
                mutableListOf(
                        Team(1, "China", "China Stars", mutableListOf(chinesePlayers)),
                        Team(2, "Holland", "Dutch Cheese", mutableListOf(dutchPlayers))
                ))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Lab1Application::class.java, *args)
}
