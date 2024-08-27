package orderEntryPhase2;

public class OrderEntryPhase2 {




import java.util.Scanner;

public class ItemCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item number (alphanumeric): ");
        String itemNumber = scanner.nextLine();

        System.out.print("Enter item description (alphanumeric): ");
        String itemDescription = scanner.nextLine();

        System.out.print("Enter the item price (decimal): ");
        double itemPrice = scanner.nextDouble();

        System.out.print("Enter quantity ordered (integer): ");
        int quantityOrdered = scanner.nextInt();

        double grossAmount = itemPrice * quantityOrdered;

        System.out.print("Enter the tax percentage for the item (decimal): ");
        double taxPercentage = scanner.nextDouble();
        double taxAmount = (grossAmount * taxPercentage) / 100;

        System.out.print("Enter the discount percent for the item (decimal): ");
        double discountPercentage = scanner.nextDouble();
        double discountAmount = (grossAmount * discountPercentage) / 100;

        double netAmount = grossAmount + taxAmount - discountAmount;

        System.out.println("Gross Amount: " + grossAmount);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Net Amount: " + netAmount);

        scanner.close();
    }
}
