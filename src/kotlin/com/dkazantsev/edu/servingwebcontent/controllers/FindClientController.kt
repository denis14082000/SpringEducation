package com.dkazantsev.edu.servingwebcontent.controllers

import com.dkazantsev.edu.servingwebcontent.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class FindClientController {

    @Autowired
    lateinit var clientService : ClientService

    @GetMapping("/findClientForm")
    fun findClientForm(model : Model) : String {
        return "findClientForm"
    }

    @GetMapping("/findClientForm/find")
    fun findClient(@RequestParam id : Int, model: Model) : String {
        println(clientService.findClientById(id))
        return "redirect:/"
    }
}