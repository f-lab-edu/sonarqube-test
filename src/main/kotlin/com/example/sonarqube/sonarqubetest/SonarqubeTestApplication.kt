package com.example.sonarqube.sonarqubetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SonarqubeTestApplication

fun main(args: Array<String>) {
    println("Hello, world!")
                                        println("Hello, world!")
    println("Hello, world!")
    println("Hello, world!")
    runApplication<SonarqubeTestApplication>(*args)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
