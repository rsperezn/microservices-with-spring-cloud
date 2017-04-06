package com.rspn.service

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class SentenceServiceImpl : SentenceService {
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

    @HystrixCommand(fallbackMethod = "getFallBackAdjective")
    override fun  getAdjective() = adjectiveClient.getRandomWord().word

    @HystrixCommand(fallbackMethod = "getFallBackNoun")
    override  fun getNoun() = nounClient.getRandomWord().word

    @HystrixCommand(fallbackMethod = "getFallBackArticle")
    override  fun getArticle() = articleClient.getRandomWord().word

    @HystrixCommand(fallbackMethod = "getFallBackVerb")
    override  fun getVerb() = verbClient.getRandomWord().word

    @HystrixCommand(fallbackMethod = "getFallBackSubject")
    override fun getSubject() = subjectClient.getRandomWord().word


    private fun getFallBackNoun() = "fallBackNoun"
    private fun getFallBackAdjective() = "fallBackAdjective"
    private fun getFallBackVerb() = "fallBackVerb"
    private fun getFallBackArticle() = "fallBackArticle"
    private fun getFallBackSubject() = "fallBackSubject"
}

