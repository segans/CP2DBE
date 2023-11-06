package com.fiap.checkpoint2;


public class Department {
    private Long id;
    private String name;

    private String employees;


    public Long getId() {
        return id;
    }

    public String getEmployees() {
        return employees;
    }

    public Department(Long id, String name, String employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
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
}
