package Java.Util.Scanner;

import java.util.Scanner;

class Mark {
    int per;

    void result() {
        if (per <= 100 && per >= 90) {
            System.out.println("You got A+");
        } else if (per <= 90 && per >= 80) {
            System.out.println("You got A");
        } else if (per <= 80 && per >= 70) {
            System.out.println("You got B+");
        } else if (per <= 70 && per >= 60) {
            System.out.println("You got B+");
        } else if (per <= 60 && per >= 50) {
            System.out.println("You got C+");
        } else if (per <= 50 && per >= 40) {
            System.out.println("You got C");
        } else {
            System.out.println("Not Qualified");
        }
    }
}

public class Student {
    public static void main(String[] args) {
        Mark m1 = new Mark();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Your Percentage upto 100");
        int marks = s1.nextInt();
        if (marks <= 100 && marks >= 0) {
            m1.per = marks;
            m1.result();
        } else {
            System.out.println("Invalid Request ");

        }
    }
}