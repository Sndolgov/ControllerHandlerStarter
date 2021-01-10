package com.starter;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfiguration
{
    @Bean
    public CustomControllerAdvice customControllerAdvice(){
        return new CustomControllerAdvice();
    }
}
