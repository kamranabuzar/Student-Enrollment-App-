package StudentEnrollmentApp;
import java.util.Scanner;
public class StudentEnrollmentApp {
    public static void main(String[] args) {
        System.out.println("Please enter the number of students you would like to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStd = in.nextInt();
        Student[] std = new Student[numOfStd];
        for (int i = 0; i < numOfStd; i++)
        {
            std[i]=new Student();
            std[i].enroll();
            std[i].viewBalance();
            std[i].payTution();
        }
        for (int i = 0; i < numOfStd; i++) {
            System.out.println(std[i].toString());
            //Ask how many student will be added to the DBS
            //And then create n number of new students accordingly
        }
    }

}