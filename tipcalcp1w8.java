# Tip Calculator

package orderEntryPhase1;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "y";

        while (continueInput.equalsIgnoreCase("y")) {
            System.out.print("Enter the cost of the meal: ");
            double mealCost = scanner.nextDouble();
            System.out.println("Cost of the meal: $" + String.format("%.2f", mealCost));

            for (double tipPercentage = 0.15; tipPercentage <= 0.25; tipPercentage += 0.05) {
                double tipAmount = mealCost * tipPercentage;
                double totalCost = mealCost + tipAmount;

                System.out.println("Tip Percentage: " + (tipPercentage * 100) + "%");
                System.out.println("Tip Amount: $" + String.format("%.2f", tipAmount));
                System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
                System.out.println();
            }

            System.out.print("Do you want to enter another meal cost? (y/n): ");
            continueInput = scanner.next();
        }

        scanner.close();
    }
}
