package de.tfojuth.wagizumi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WagizumiApplication

fun main(args: Array<String>) {
	runApplication<WagizumiApplication>(*args)
}
