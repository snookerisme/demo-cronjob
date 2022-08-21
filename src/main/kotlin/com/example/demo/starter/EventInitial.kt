package com.example.demo.starter

import com.example.demo.property.ConfigProperty
import org.springframework.boot.context.event.ApplicationStartedEvent
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.EventListener
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order

@Configuration
@Order(Ordered.LOWEST_PRECEDENCE)
class EventInitial(
    private val configProperty : ConfigProperty
) {

    @EventListener(ApplicationStartedEvent::class)
    fun applicationStartedEvent() {
        println("Status : ${configProperty.test.flag}")
        if(configProperty.test.flag){
            println("Data : ${configProperty.test.data}")
        }
        println("* * * * Test run cronjob is success * * * *")
    }
}