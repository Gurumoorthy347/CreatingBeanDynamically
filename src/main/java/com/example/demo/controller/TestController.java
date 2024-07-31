package com.example.demo.controller;

import com.example.demo.service.OrderInfoFactory;
import com.example.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    OrderInfoFactory orderInfoFactory;

    @GetMapping("/testMothord")
    public ResponseEntity<?> testMethord(@RequestParam String name, @RequestParam("department") String dept){
        orderInfoFactory.testMethord(name, dept);
        return ResponseEntity.ok("Test methord");
    }
}
