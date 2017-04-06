package com.rspn

import com.rspn.service.SentenceAssembler
import com.rspn.service.SentenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SentenceController {

    @Autowired
    private lateinit var sentenceAssembler: SentenceAssembler

    @RequestMapping(value = "/sentence")
    fun getSentence(): String {
        return sentenceAssembler.getAssembledSentence()
    }
}



