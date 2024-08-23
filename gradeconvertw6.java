import java.util.Scanner;

public class LetterGradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        System.out.println("Welcome to the Letter Grade Converter");

        do {
            System.out.print("Enter numerical grade: ");
            int grade = scanner.nextInt();
            char letterGrade;

            if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter grade: " + letterGrade);
            System.out.print("Continue? (y/n): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("y"));

        System.out.println("Bye!!");
        scanner.close();
    }
}



or 


# Grade Converter

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "y";

        while (continueInput.equalsIgnoreCase("y")) {
            System.out.print("Enter a numeric grade: ");
            int numericGrade = scanner.nextInt();
            char letterGrade;

            if (numericGrade >= 90 && numericGrade <= 100) {
                letterGrade = 'A';
            } else if (numericGrade >= 80 && numericGrade < 90) {
                letterGrade = 'B';
            } else if (numericGrade >= 70 && numericGrade < 80) {
                letterGrade = 'C';
            } else if (numericGrade >= 60 && numericGrade < 70) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter grade: " + letterGrade);
            System.out.print("Do you want to enter another grade? (y/n): ");
            continueInput = scanner.next();
        }

        scanner.close();
    }
}


