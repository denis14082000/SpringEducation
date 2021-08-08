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
        return clientDao.findClientById(id)
    }

    override fun findAll(): List<Client> {
        return clientDao.findAllClient()
    }
}