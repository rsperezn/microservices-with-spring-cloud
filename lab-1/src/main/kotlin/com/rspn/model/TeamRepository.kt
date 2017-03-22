package com.rspn.model

import com.rspn.controller.Team
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RestResource

@RestResource(path="teams", rel="team")
interface TeamRepository : JpaRepository<Team, Long> {
    fun findByLocation(teamName: String): Team
}