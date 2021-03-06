package com.rspn.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("VERB")
interface VerbClient {
    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun getRandomWord(): Word

}

