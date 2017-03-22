package com.rspn

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LuckyWordController {

    @Value("\${lucky-word}")
    internal var luckyWord: String? = null

    @RequestMapping("/lucky-word")
    fun showLuckyWord(): String {
        return "The lucky word is: " + luckyWord!!
    }
}