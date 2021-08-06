package ClientService.impl

import ClientService.ClientService
import org.springframework.stereotype.Service

@Service("ClientService")
class ClientServiceImpl : ClientService {
    override fun getClientId() : Int {
        return 10
    }
}