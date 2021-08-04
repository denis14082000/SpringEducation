import ClientService.impl.ClientServiceImpl
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {
    val ctx = ClassPathXmlApplicationContext("spring/context.xml")
    var clientService = ctx.getBean("clientService", ClientServiceImpl::class.java)
    println(clientService.getClientId())
}