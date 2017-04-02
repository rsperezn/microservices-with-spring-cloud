package com.rspn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class WordApplication

fun main(args: Array<String>) {
    SpringApplication.run(WordApplication::class.java, *args)
}
