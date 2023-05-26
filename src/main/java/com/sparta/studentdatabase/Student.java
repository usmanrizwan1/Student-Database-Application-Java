package com.sparta.studentdatabase;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor: Prompt users to enter students name and year
public Student(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Students frist name: ");
    this.firstName = in.nextLine();

    System.out.println("Enter Students last name: ");
    this.lastName = in.nextLine();

    System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Students class level: ");
    this.gradeYear = in.nextInt();

    setStudentID();




}
    // Generate an ID

    private void setStudentID() {
    // Grade level + ID
        id++;
    this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses

    public void enroll(){
    //Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        }     while (1 != 0);

    }

    // View balance
    public void viewBalance() {
      System.out.println("Your balance is: £" + tuitionBalance);
    }

    // and pay tuition

    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thankyou for your payment of: £" + payment);
        viewBalance();
    }

    // Show status

    public String toString(){
    return "Name: " + firstName + lastName + "\nGrade Level" + gradeYear + "\nStudent ID: " + studentID  + "\n Courses Enrolled:" + courses + "\n Balance: " + tuitionBalance;
    }
}
