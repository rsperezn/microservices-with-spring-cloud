package com.rspn.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class SentenceService {
    @Autowired
    private lateinit var nounClient: NounClient
    @Autowired
    private lateinit var verbClient: VerbClient
    @Autowired
    private lateinit var adjectiveClient: AdjectiveClient
    @Autowired
    private lateinit var articleClient: ArticleClient
    @Autowired
    private lateinit var subjectClient: SubjectClient


    fun createSentence(): String {
        val builder = StringBuilder()
        builder.append(subjectClient.getRandomWord().word).append(" ")
                .append(verbClient.getRandomWord().word).append(" ")
                .append(articleClient.getRandomWord().word).append(" ")
                .append(nounClient.getRandomWord().word).append(" ")
                .append(adjectiveClient.getRandomWord().word)

        return builder.append(".").toString()
    }
}

