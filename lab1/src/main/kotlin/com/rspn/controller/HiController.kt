package com.rspn.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(value = "/hi")
open class HiController {
    @RequestMapping
    fun sayHi(): String {
        println("In controller")
        return "hi"
    }
}
