package com.arief.thymeleaf.configs;

import com.arief.thymeleaf.models.Car;
import com.arief.thymeleaf.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringAppContext {

    @Bean
    public Person arief(){
        return new Person("Arief","Indonesia");
    }
    @Bean
    public Person putro(){
        return new Person("Putro","Indonesia");
    }

    @Bean
    public Car ferrari(){
        return new Car("Ferrari","Sport car");
    }
    @Bean
    public Car bugatti(){
        return new Car("Bugatti","Super car");
    }
}
