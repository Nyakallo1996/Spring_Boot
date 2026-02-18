package com.nyakallo.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("my first bean");
    }

    @Bean
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("my Second bean");
    }

    @Bean
    @Primary
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("my Third bean");
    }
}
