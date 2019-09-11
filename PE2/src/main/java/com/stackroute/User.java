package com.stackroute;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    User(String fName, String lName, double sal) {
        firstName = fName;
        lastName = lName;
        salary = sal;
    }



    public String getFullName() {
        String Name = this.firstName + " " + this.lastName;
        return Name;
    }

    public boolean isValidAge(int age) {
        if(age>=18 && age<=60) {
            this.age = age;
            return true;
        }
        else
            return false;
    }

}
