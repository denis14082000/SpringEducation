package ClientService.impl

import ClientService.ClientService
import org.springframework.stereotype.Component

@Component
class ClientServiceImpl : ClientService {
    override fun getClientId() : Int {
        return 10
    }
}