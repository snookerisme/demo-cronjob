package com.example.demo.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "config")
class ConfigProperty(
    val test: Test
){
    data class Test(
        val flag: Boolean,
        val data: String
    )
}
