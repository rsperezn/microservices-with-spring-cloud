package com.rspn.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class SentenceService {
    @Autowired
    private lateinit var nounClient: NounClient
    @Autowired
    private lateinit var verbService: WordService
    @Autowired
    private lateinit var adjectiveService: WordService
    @Autowired
    private lateinit var articleService: WordService
    @Autowired
    private lateinit var subjectService: WordService


    fun createSentence(): String {
        val builder = StringBuilder()
        listOf(subjectService, verbService, articleService, adjectiveService).forEach {
            builder.append(it.word.word).append(" ")
        }
        builder.append(nounClient.getRandomWord().word)

        return builder.append(".").toString()
    }
}

