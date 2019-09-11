package com.stackroute;

public class StudGrades {

    public int[] StudentGrades(int[] grades) {
        int[] val = new int[3];
        val[0] = average(grades);
        val[1] = minimum(grades);
        val[2] = maximum(grades);
        display(grades);
        return val;
    }

    public int average(int[] grades) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        avg = sum / (grades.length);
        return avg;
    }

    public int minimum(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min)
                min = grades[i];
        }
        return min;
    }

    public int maximum(int[] grades) {
        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max)
                max = grades[i];
        }
        return max;
    }

    public void display(int[] grades) {
        System.out.println("Number of students: " + grades.length);
    }
}
