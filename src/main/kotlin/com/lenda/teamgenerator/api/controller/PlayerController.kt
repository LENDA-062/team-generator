package com.lenda.teamgenerator.api.controller

import com.lenda.teamgenerator.domain.model.Player
import com.lenda.teamgenerator.domain.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class PlayerController(private val playerService: PlayerService){

    @PostMapping(consumes = ["text/plain"])
    fun savePlayer(@RequestBody player: String){
        playerService.savePlayer(player)
    }

    @GetMapping
    fun listPlayers():List<Player>{
        return playerService.listPlayers()
    }

    @DeleteMapping("/{id}")
    fun deletePlayers(@PathVariable id: Long){
        playerService.deletePlayer(id)
    }
}