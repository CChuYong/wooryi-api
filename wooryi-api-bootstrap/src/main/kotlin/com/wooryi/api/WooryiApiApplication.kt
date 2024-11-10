package com.wooryi.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WooryiApiApplication

fun main(args: Array<String>) {
	runApplication<WooryiApiApplication>(*args)
}
