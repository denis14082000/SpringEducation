package services.impl
import org.springframework.stereotype.Service
import services.Test

@Service("Test")
class TestImpl : Test {
    override fun testClient() : String {
        return "TestWorks"
    }
}