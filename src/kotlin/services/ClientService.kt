package services

import entities.Client

interface ClientService {
    fun findClientById(id : Int) : Client
    fun findAll() : List<Client>
}