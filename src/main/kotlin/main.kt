import ClientService.impl.ClientServiceImpl
import ClientService.impl.test
import org.springframework.context.support.ClassPathXmlApplicationContext



fun main() {
    val ctx = ClassPathXmlApplicationContext("spring/context.xml")
    val clientService = ctx.getBean("ClientService", ClientServiceImpl::class.java)
    val clientTest = ctx.getBean("test", test::class.java)
    println(clientService.getClientId())
    println(clientTest.testClient())
}