package services.impl

import dao.ClientDao
import entities.Client
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import services.ClientService

@Service("ClientService")
class ClientServiceImpl : ClientService {

    @Autowired
    private lateinit var clientDao : ClientDao

    override fun findClientById(id : Int): Client {
        val client = clientDao.findClientById(id)
        return client
    }
}