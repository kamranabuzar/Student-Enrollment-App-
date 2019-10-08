package StudentEnrollmentApp;

import javax.swing.*;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private String id;
    private String courses="";
    private static int idInitial = 1000;
    private int tutionBalance = 0;
    private int costOfCourse = 600;

    //Following Constructor:
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Pls enter the first name: ");
        this.firstName = in.nextLine();
        System.out.println("Pls enter the last name: ");
        this.lastName = in.nextLine();
        System.out.println("Pls enter 1 for Freshman\2 for Sopho\3 for Junior\4 for Senior: ");
        this.gradYear = in.nextInt();
        setStudentId();
        //System.out.println(firstName + " " + lastName + " " + id + " " + gradYear);
    }

    //generate id
    private void setStudentId() {
        idInitial++;
        this.id = gradYear + "-" + idInitial;
    }

    //enroll in courses
    //view balance
    public void enroll() {
        do {
            System.out.println("Type the course or enter Q to Quit");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {

                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {

                break;
            }

        } while (1 != 0);
        //System.out.println("Congrats! You have enrolled in the following courses: " + courses);

    }

    //VIEW BALANCE
    public void viewBalance() {
        System.out.println("Please pay your due Balance of " + tutionBalance+" now.");
    }

    //pay tution
    public void payTution() {
        System.out.println("Please enter your payment now: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        //System.out.println("Thank you for the payment of " + payment + ". " + "Your remaining Balance is " + tutionBalance + ".");
    }

    //show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: "+id+
                "\nCourses Enrolled in: " + courses +
                "\nGrade Year: "+gradYear+
                "\nBalance: "+tutionBalance;

    }
}


