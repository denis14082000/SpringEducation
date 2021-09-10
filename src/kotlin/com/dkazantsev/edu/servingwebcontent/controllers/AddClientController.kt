package com.dkazantsev.edu.servingwebcontent.controllers

import com.dkazantsev.edu.servingwebcontent.dao.ClientDao
import com.dkazantsev.edu.servingwebcontent.entities.Client
import com.dkazantsev.edu.servingwebcontent.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class AddClientController {

    @Autowired
    lateinit var clientService: ClientDao

    @GetMapping("/addClientForm")
    fun addClientForm(model : Model) : String {
        return "addClientForm"
    }

    @PostMapping("/addClientForm")
    fun addClientMethod(@RequestParam name : String, model: Model) : String {
        val clientToSave = Client(name)
        clientService.addClient(clientToSave)
        return "redirect:/"
    }
}