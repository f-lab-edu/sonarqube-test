package com.example.sonarqube.sonarqubetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SonarqubeTestApplication

fun main(args: Array<String>) {
    println("Hello, world!")
    runApplication<SonarqubeTestApplication>(*args)
}
