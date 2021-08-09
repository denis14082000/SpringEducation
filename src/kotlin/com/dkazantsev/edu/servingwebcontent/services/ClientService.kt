package com.dkazantsev.edu.servingwebcontent.services

import com.dkazantsev.edu.servingwebcontent.entities.Client

interface ClientService {
    fun findClientById(id : Int) : Client
    fun findAll() : List<Client>
    fun removeClient(id : Int) : String
    fun saveClient(name : String) : Client
}