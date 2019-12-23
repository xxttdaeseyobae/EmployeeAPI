package com.softwarica.employeeapi.model;

public class EmployeeCUD {

    private int id;
    private String name;
    private Float salary;
    private int age;
    private String profile_img;

    public EmployeeCUD(String name, Float salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

}