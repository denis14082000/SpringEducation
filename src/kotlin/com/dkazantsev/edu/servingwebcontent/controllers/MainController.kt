package com.dkazantsev.edu.servingwebcontent.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping




@Controller
class MainController {
    @GetMapping("/")
    fun main(model: Model): String {
        model.addAttribute("title", "Main page")
        return "main"
    }
}