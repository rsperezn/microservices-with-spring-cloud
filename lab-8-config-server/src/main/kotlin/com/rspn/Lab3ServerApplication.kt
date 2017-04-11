package com.rspn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class lab8ServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(lab8ServerApplication::class.java, *args)
}
