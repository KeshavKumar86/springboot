package com.keshav.springxmlconfigpractice.bean;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String company;

    public Employee(int id, String name, int age, String company) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }
}
