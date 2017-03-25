package com.rspn

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class SentenceController {
    @Autowired
    private lateinit var discoveryClient: DiscoveryClient

    @RequestMapping(value = "/sentence")
    fun getSentence(): String {
        val builder = StringBuilder()
        listOf("LAB-4-SUBJECT", "LAB-4-VERB", "LAB-4-ARTICLE", "LAB-4-ADJECTIVE", "LAB-4-NOUN").forEach {
            builder.append(getWord(it)).append(" ")
        }
        return builder.append(".").toString()
    }

    private fun getWord(service: String): String? {
        val list = discoveryClient.getInstances(service)
        if (list != null && list.isNotEmpty()) {
            val uri = list[0].uri
            val template = RestTemplate()
            return template.getForObject(uri, String::class.java)
        }
        return null
    }
}

