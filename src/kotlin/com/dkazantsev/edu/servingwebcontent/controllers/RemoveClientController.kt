package com.dkazantsev.edu.servingwebcontent.controllers

import com.dkazantsev.edu.servingwebcontent.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class RemoveClientController {

    @Autowired
    lateinit var clientService : ClientService

    @GetMapping("/removeClientForm")
    fun removeClientForm(model : Model) : String {
        return "removeClientForm"
    }

    @GetMapping("/removeClientForm/remove")
    fun removeClient(@RequestParam id : Int, model: Model) : String {
        val clientToRemove = clientService.findClientById(id)
        clientService.removeClient(clientToRemove)
        return "redirect:/"
    }

}