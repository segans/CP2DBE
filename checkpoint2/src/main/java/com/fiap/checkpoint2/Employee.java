package com.fiap.checkpoint2;

public class Employee {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public com.fiap.checkpoint2.Employee getManager() {
        return manager;
    }

    public void setManager(com.fiap.checkpoint2.Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private String name;
    private String title;
    private double salary;

    public Employee(Long id, String name, String title, double salary, com.fiap.checkpoint2.Employee manager, Department department) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    private Employee manager;


    private Department department;
}

