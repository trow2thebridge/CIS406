package orderEntryPhase1;

import java.util.Scanner;

public class InterestRateCalculatorPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "y";

        while (continueInput.equalsIgnoreCase("y")) {
            System.out.print("Enter the loan amount: ");
            double loanAmount = scanner.nextDouble();

            System.out.print("Enter the interest rate (whole number): ");
            double interestRate = scanner.nextDouble() / 100;

            double interestAmount = calculateInterest(loanAmount, interestRate);

            System.out.printf("Loan Amount: %.2f%n", loanAmount);
            System.out.printf("Interest Rate: %.2f%%%n", interestRate * 100);
            System.out.printf("Interest Amount: %.2f%n", interestAmount);

            System.out.print("Do you want to continue? (y/n): ");
            continueInput = scanner.next();
        }

        scanner.close();
    }

    public static double calculateInterest(double loanAmount, double interestRate) {
        return loanAmount * interestRate;
    }
}
