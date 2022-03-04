package com.lenda.teamgenerator.domain.service

import com.lenda.teamgenerator.domain.model.Player
import com.lenda.teamgenerator.domain.repository.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerService(private val playerRepository: PlayerRepository){

    fun savePlayer(player: String ){
        var newPlayer: Player = Player(name = player)
        playerRepository.save(newPlayer)
    }

    fun listPlayers(): List<Player>{
        return playerRepository.findAll()
    }

    fun deletePlayer(id: Long){
        playerRepository.deleteById(id)
    }
}