package com.example.demo.service;

import com.example.demo.pojo.Employee;
import com.example.demo.pojo.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class TestService extends Test {

    private static Logger logger = LoggerFactory.getLogger(TestService.class);

    public void printMethod(){
        System.out.println("Name"+super.employee.toString());
        System.out.println("Department"+super.department);
    }

    public TestService(Employee emp, String department) {
        super(emp, department);
    }


}
