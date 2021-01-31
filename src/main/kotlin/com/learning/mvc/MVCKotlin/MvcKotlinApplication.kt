package com.learning.mvc.MVCKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MvcKotlinApplication

fun main(args: Array<String>) {
	runApplication<MvcKotlinApplication>(*args)
}
