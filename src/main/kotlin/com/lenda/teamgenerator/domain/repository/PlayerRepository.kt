package com.lenda.teamgenerator.domain.repository

import com.lenda.teamgenerator.domain.model.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository: JpaRepository<Player, Long> { }