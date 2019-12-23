package com.softwarica.employeeapi.model;

public class Employee {
    private int id;
    private String employee_name;
    private Float employee_salary;
    private int employee_age;
    private String profile_img;

    public Employee(int id, String employee_name, Float employee_salary, int employee_age, String profile_img) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_img = profile_img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Float employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(String profile_img) {
        this.profile_img = profile_img;
    }
}
