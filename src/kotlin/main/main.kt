import org.springframework.context.support.ClassPathXmlApplicationContext
import services.impl.ClientServiceImpl


fun main() {
    val ctx = ClassPathXmlApplicationContext("spring/context.xml")
    val clientService = ctx.getBean("ClientService", ClientServiceImpl::class.java)
    val client = clientService.findClientById(1)
    val clientList = clientService.findAll()
    println(client)
    println("\nAll clients")
    for (items in clientList) {
        println(items)
    }

}