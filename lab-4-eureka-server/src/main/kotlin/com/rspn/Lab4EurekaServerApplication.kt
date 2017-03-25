package com.rspn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class Lab4EurekaServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(Lab4EurekaServerApplication::class.java, *args)
}
