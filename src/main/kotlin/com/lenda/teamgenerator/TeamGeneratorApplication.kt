package com.lenda.teamgenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TeamGeneratorApplication

fun main(args: Array<String>) {
	runApplication<TeamGeneratorApplication>(*args)
}
