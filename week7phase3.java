import java.util.Scanner;

public class ItemCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "y";
        int totalItems = 0;
        double totalGrossAmount = 0.0;
        double totalTaxAmount = 0.0;
        double totalDiscountAmount = 0.0;
        double totalNetAmount = 0.0;

        while (continueInput.equalsIgnoreCase("y")) {
            System.out.print("Enter item number (alphanumeric): ");
            String itemNumber = scanner.nextLine();
            System.out.print("Enter item description (alphanumeric): ");
            String itemDescription = scanner.nextLine();
            System.out.print("Enter the item price (decimal): ");
            double itemPrice = scanner.nextDouble();
            System.out.print("Enter quantity ordered (integer): ");
            int quantityOrdered = scanner.nextInt();
            double grossAmount = itemPrice * quantityOrdered;
            totalGrossAmount += grossAmount;

            System.out.print("Enter the tax percentage for the item (decimal): ");
            double taxPercentage = scanner.nextDouble();
            double taxAmount = grossAmount * (taxPercentage / 100);
            totalTaxAmount += taxAmount;

            System.out.print("Enter the discount percent for the item (decimal): ");
            double discountPercentage = scanner.nextDouble();
            double discountAmount = grossAmount * (discountPercentage / 100);
            totalDiscountAmount += discountAmount;

            double netAmount = grossAmount + taxAmount - discountAmount;
            totalNetAmount += netAmount;

            System.out.println("Item Number: " + itemNumber);
            System.out.println("Item Description: " + itemDescription);
            System.out.println("Item Price: " + String.format("%.2f", itemPrice));
            System.out.println("Quantity Ordered: " + quantityOrdered);
            System.out.println("Tax Percentage: " + String.format("%.2f", taxPercentage));
            System.out.println("Tax Amount: " + String.format("%.2f", taxAmount));
            System.out.println("Discount Percentage: " + String.format("%.2f", discountPercentage));
            System.out.println("Discount Amount: " + String.format("%.2f", discountAmount));
            System.out.println("Net Amount: " + String.format("%.2f", netAmount));
            System.out.println();

            totalItems++;

            System.out.print("Do you want to enter another item? (y/n): ");
            continueInput = scanner.next();
            scanner.nextLine(); // Consume newline
        }

        System.out.println("Total Number of Line Items: " + totalItems);
        System.out.println("Total Gross Amount: " + String.format("%.2f", totalGrossAmount));
        System.out.println("Total Tax Amount: " + String.format("%.2f", totalTaxAmount));
        System.out.println("Total Discount Amount: " + String.format("%.2f", totalDiscountAmount));
        System.out.println("Total Net Amount: " + String.format("%.2f", totalNetAmount));

        scanner.close();
    }
}