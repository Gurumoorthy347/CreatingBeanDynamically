package com.example.demo.config;

import com.example.demo.pojo.Employee;
import com.example.demo.service.TestService;
import org.hibernate.annotations.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

//    @Bean
//    @Scope("prototype")
//    public TestService createTestService(){
//        return new TestService( new Employee("Guru"), "IT");
//    }
}
