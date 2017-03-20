package com.rspn.model

import com.rspn.controller.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RestResource

@RestResource(path = "players", rel = "players")
interface PlayerRepository : JpaRepository<Player, Long> {
}