package com.rspn.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

abstract class WordService {

    @Autowired
    internal var loadBalancer: LoadBalancerClient? = null

    abstract val clientName: String

    val word: Word
        get() {
            val instance = loadBalancer!!.choose(clientName)
            return RestTemplate().getForObject(instance.uri, Word::class.java)
        }
}

@Service
class NounService : WordService() {
    override val clientName: String
        get() = "NOUN"

}

@Service
class AdjectiveService : WordService() {
    override val clientName: String
        get() = "ADJECTIVE"
}

@Service
class VerbService : WordService() {
    override val clientName: String
        get() = "VERB"

}

@Service
class ArticleService : WordService() {
    override val clientName: String
        get() = "ARTICLE"

}

@Service
class SubjectService : WordService() {
    override val clientName: String
        get() = "SUBJECT"
}

data class Word(val word: String)

