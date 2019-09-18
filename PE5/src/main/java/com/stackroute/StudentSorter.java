package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {

        // for comparison
        int NameCompare = a.getName().compareTo(b.getName());
        int AgeCompare = a.getAge() - b.getAge();
        int IdCompare = a.getId() - b.getId();

        // 2-level comparison using if-else block
        if (AgeCompare == 0) {
            if(NameCompare == 0) {
                return ((IdCompare == 0) ? NameCompare : IdCompare);
            }
            else
                return NameCompare;
        } else {
            return AgeCompare;
        }
    }
}
   /* public void compareName(Student a, Student b)
    {
        this.sort2 = a.getName().compareTo(b.getName());
        if(sort2 == 0);
            compareId(a, b);
    }
    public int compareId(Student a, Student b)
    {
        return a.getName().compareTo(b.getName());
    }*/

