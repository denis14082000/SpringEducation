import org.springframework.context.support.ClassPathXmlApplicationContext
import services.impl.ClientServiceImpl
import services.impl.TestImpl


fun main() {
    val ctx = ClassPathXmlApplicationContext("spring/context.xml")
    val clientService = ctx.getBean("ClientService", ClientServiceImpl::class.java)
    val clientTest = ctx.getBean("Test", TestImpl::class.java)
    println(clientService.getClientId())
    println(clientTest.testClient())
}