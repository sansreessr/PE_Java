package com.stackroute;

public class MemberVariable {
   public static void main(String[] args) {
       Member obj = new Member();
       obj.setDet("Sreenath", 57, 34454445.4);
       String name = obj.getName();
       int age = obj.getAge();
       double salary = obj.getSalary();

       System.out.println("Member Name: " + name);
       System.out.println("Member Age: " + age);
       System.out.println("Member Salary: " + salary);
   }
}
