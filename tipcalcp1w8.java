package orderEntryPhase1

public class TipCalculator

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("Cost of meal: ");
            double mealCost = scanner.nextDouble();

            double[] tipPercentages = {0.15, 0.20, 0.25};

            for (double tipPercentage : tipPercentages) {
                double tipAmount = mealCost * tipPercentage;
                double totalAmount = mealCost + tipAmount;
                System.out.printf("%.0f%%\nTip amount: $%.2f\nTotal amount: $%.2f\n", tipPercentage * 100, tipAmount, totalAmount);
            }

            System.out.print("Continue? (y/n): ");
            char response = scanner.next().charAt(0);
            continueCalculating = (response == 'y' || response == 'Y');
        }

        System.out.println("Bye!!!");
        scanner.close();
    }
}
