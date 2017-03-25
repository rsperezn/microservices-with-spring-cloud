package com.rspn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class Lab4SubjectApplication

fun main(args: Array<String>) {
    SpringApplication.run(Lab4SubjectApplication::class.java, *args)
}
