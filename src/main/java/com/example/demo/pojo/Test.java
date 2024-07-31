package com.example.demo.pojo;


//@Component
public abstract class Test {

    protected final Employee employee;

    protected final String department;

    public Test(Employee employee, String department) {
        this.employee = employee;
        this.department = department;
    }


    public Test(){
        this.employee = null;
        this.department = null;
    }
}
