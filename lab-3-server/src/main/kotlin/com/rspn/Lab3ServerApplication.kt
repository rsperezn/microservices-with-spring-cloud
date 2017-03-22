package com.rspn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class Lab3ServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(Lab3ServerApplication::class.java, *args)
}
