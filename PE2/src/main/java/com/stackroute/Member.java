package com.stackroute;

public class Member {

    private String name;
    private int age;
    private double salary;

    public void setDet(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }
}
