package com.dkazantsev.edu.servingwebcontent.services.impl

import com.dkazantsev.edu.servingwebcontent.dao.ClientDao
import com.dkazantsev.edu.servingwebcontent.entities.Client
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.dkazantsev.edu.servingwebcontent.services.ClientService

@Service("ClientService")
class ClientServiceImpl : ClientService {

    @Autowired
    private lateinit var clientDao : ClientDao
//
//    override fun findClientById(id : Int): Client {
//        return clientDao.findClientById(id)
//    }
//
//    override fun findAll(): List<Client> {
//        return clientDao.findAllClient()
//    }
//
//    override fun removeClient(id : Int): String {
//        return clientDao.removeClient(id)
//    }

    override fun saveClient(clientToSave : Client){
        clientDao.addClient(clientToSave)
    }
}