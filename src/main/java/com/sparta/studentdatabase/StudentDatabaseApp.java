package com.sparta.studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp{

    public static void main(String[] args) {
        //Ask how many new students we want to add

        System.out.println("Enter number of new students to enroll");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new users

        for (int n=0; n<numOfStudents; n++) {
           students[n] = new Student();
           students[n].enroll();
           students[n].payTuition();
            System.out.println(students[n].toString());

        }
        System.out.println("Testing for github ignore this");

    }
}
