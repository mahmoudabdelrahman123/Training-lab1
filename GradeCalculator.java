package lab2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
            System.out.println("Excellent");
        }
        else if (score >= 80) {
            System.out.println("Grade: B");
            System.out.println("Very Good");
        }
        else if (score >= 70) {
            System.out.println("Grade: C");
            System.out.println("Good");
        }
        else if (score >= 60) {
            System.out.println("Grade: D");
            System.out.println("Pass");
        }
        else if (score >= 0) {
            System.out.println("Grade: F");
            System.out.println("Needs improvement");
        }
        else {
            System.out.println("Invalid score");
        }
    }
}
