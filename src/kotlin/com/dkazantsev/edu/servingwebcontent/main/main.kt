package com.dkazantsev.edu.servingwebcontent

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
open class ServingWebContentApplication

fun main() {
    SpringApplication.run(ServingWebContentApplication::class.java)
}