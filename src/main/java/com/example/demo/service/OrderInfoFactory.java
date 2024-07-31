package com.example.demo.service;

import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoFactory {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    BeanFactory beanFactory;

//    @Autowired
//    TestService testService;

//    public TestService testMethord(@Value("#{name}") String name, @Value("#{email}")String email){
//        TestService testService = beanFactory.getBean(TestService.class, name, email);
//        applicationContext.getAutowireCapableBeanFactory().autowireBean(testService);
//        return testService;
//    }

    public TestService testMethord(String name, String department){
        Employee emp = new Employee(name);
        TestService testService = beanFactory.getBean(TestService.class, emp, department);
        testService.printMethod();
        System.out.println(testService.hashCode());
        return testService;
    }
}
