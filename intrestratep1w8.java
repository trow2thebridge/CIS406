
package orderEntryPhase1;

public class IntrestRateCalculatorPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter loan amount: ");
            double loanAmount = scanner.nextDouble();
            System.out.print("Enter interest rate: ");
            double interestRate = scanner.nextDouble();

            double interest = (loanAmount * interestRate) / 100;

            System.out.printf("Loan amount: $%,.2f%n", loanAmount);
            System.out.printf("Interest rate: %.1f%%%n", interestRate);
            System.out.printf("Interest: $%,.2f%n", interest);

            System.out.print("Continue?(y/n): ");
            char choice = scanner.next().charAt(0);
            continueCalculation = (choice == 'y' || choice == 'Y');
        }

        System.out.println("Bye!!!");
        scanner.close();
    }
}
