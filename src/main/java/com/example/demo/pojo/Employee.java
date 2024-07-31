package com.example.demo.pojo;

public class Employee {

    protected String name;

    protected String email;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Employee(String name){
        this.name = name;
    }

    public Employee(){}
}
