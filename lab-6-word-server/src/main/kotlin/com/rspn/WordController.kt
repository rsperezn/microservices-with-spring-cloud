package com.rspn

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WordController {

    @Value("\${words}")
    private val words: String? = null

    @RequestMapping(value = "/")
    fun getRandomWord(): Word {
        val subjects = words?.split(",")
        val random = Math.round(Math.random() * (subjects!!.size - 1)).toInt()
        return Word(subjects[random])
    }

    data class Word(val word: String)
}

