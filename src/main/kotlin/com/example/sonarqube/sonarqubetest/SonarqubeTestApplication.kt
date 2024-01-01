package com.example.sonarqube.sonarqubetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.math.BigInteger

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
