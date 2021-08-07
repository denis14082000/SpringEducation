package services

import entities.Client

interface ClientService {
    fun findClientById(id : Int) : Client
}