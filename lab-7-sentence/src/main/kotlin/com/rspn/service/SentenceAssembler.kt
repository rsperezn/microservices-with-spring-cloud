package com.rspn.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class SentenceAssembler {
    @Autowired
    lateinit var sentenceService: SentenceService

    fun getAssembledSentence(): String {

        val builder = StringBuilder()
        builder.append(sentenceService.getSubject()).append(" ")
                .append(sentenceService.getVerb()).append(" ")
                .append(sentenceService.getArticle()).append(" ")
                .append(sentenceService.getNoun()).append(" ")
                .append(sentenceService.getAdjective())

        return builder.append(".").toString()
    }


}