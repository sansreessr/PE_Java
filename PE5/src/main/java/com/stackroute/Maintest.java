package com.stackroute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Maintest {

    public static void mainTest() {
        Student obj1 = new Student();
        obj1.setId(100);
        obj1.setName("Sreenath");
        obj1.setAge(23);

        Student obj2 = new Student();
        obj2.setId(101);
        obj2.setName("Sachin");
        obj2.setAge(22);

        Student obj3 = new Student();
        obj3.setId(102);
        obj3.setName("Adityan");
        obj3.setAge(20);

        Student obj4 = new Student();
        obj4.setId(103);
        obj4.setName("Febin");
        obj4.setAge(22);

        Student obj5 = new Student();
        obj5.setId(104);
        obj5.setName("Jerwin");
        obj5.setAge(21);

        Student obj6 = new Student();
        obj6.setId(105);
        obj6.setName("Sachin");
        obj6.setAge(22);

        List<Student> list = new ArrayList<>();
        list.add(obj6);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Collections.sort(list, new StudentSorter());
        Collections.reverse(list);

        for(Student st: list) {
            System.out.print(st.getId() + " " + st.getName() + " " + st.getAge() + '\n');
        }
    }
}
