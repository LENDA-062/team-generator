package com.lenda.teamgenerator.domain.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "players")
@SequenceGenerator(name = "player_seq", allocationSize = 1)
class Player(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_seq")
    val id: Long = 0,
    //notBlank
    val name: String = "nome padrão"
)