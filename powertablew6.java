package powersTable;

import java.util.Scanner;

public class PowersTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "y";

        while (continueInput.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            StringBuilder table = new StringBuilder();

            table.append("Number\tSquare\tCube\n");

            for (int i = 1; i <= number; i++) {
                int square = i * i;
                int cube = i * i * i;
                table.append(i).append("\t").append(square).append("\t").append(cube).append("\n");
            }

            System.out.println(table.toString());
            System.out.print("Do you want to continue? (y/n): ");
            continueInput = scanner.next();
        }

        scanner.close();
    }
}




package powersTable;

import java.util.Scanner;

public class PowersTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();

            System.out.println("Number");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }

            System.out.println("Squared");
            for (int i = 1; i <= n; i++) {
                System.out.println(i * i);
            }

            System.out.println("Cubed");
            for (int i = 1; i <= n; i++) {
                System.out.println(i * i * i);
            }

            System.out.print("Continue? (y/n): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("y"));

        System.out.println("Bye!!");
        scanner.close();
    }
}



import java.util.Scanner;

public class SquaresAndCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.println("Welcome to the Squares and Cubes table");
            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();

            System.out.println("\nNumber");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }

            System.out.println("Squared");
            for (int i = 1; i <= n; i++) {
                System.out.println(i * i);
            }

            System.out.println("Cubed");
            for (int i = 1; i <= n; i++) {
                System.out.println(i * i * i);
            }

            System.out.print("\nContinue? (y/n): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("y"));

        System.out.println("\nBye!!");
        scanner.close();
    }
}
