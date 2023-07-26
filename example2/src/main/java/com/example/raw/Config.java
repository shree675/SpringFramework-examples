package com.example.raw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "animal1")
    public Animal animal1Factory() {
        return new Animal("abc");
    }

    @Bean(name = "animal2")
    public Animal animal2Factory() {
        return new Animal("def");
    }
}
