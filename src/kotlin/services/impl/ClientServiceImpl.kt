package services.impl

import org.springframework.stereotype.Service
import services.ClientService

@Service("ClientService")
class ClientServiceImpl : ClientService {
    override fun getClientId() : Int {
        return 10
    }
}