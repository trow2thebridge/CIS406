# Travel Time Calculator

package travelTimeConverter;

import java.util.Scanner;

public class TravelTimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Travel Time Calculator");
        
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        
        System.out.print("Enter miles per hour: ");
        double mph = scanner.nextDouble();
        
        double hours = miles / mph;
        int wholeHours = (int) hours;
        int minutes = (int) ((hours - wholeHours) * 60);
        
        System.out.println("\nEstimated travel time");
        System.out.println("———————————-");
        System.out.println("Hours:      " + wholeHours);
        System.out.println("Minutes:  " + minutes);
        
        System.out.println("\nBye!!");
        
        scanner.close();
    }
}







package travelTimeConverter


public class TravelTimeConverter  {


package travelTimeCalculator

import java.util.Scanner;

public class TravelTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();

        System.out.print("Enter miles per hour: ");
        double mph = scanner.nextDouble();

        double hours = miles / mph;
        int wholeHours = (int) hours;
        int minutes = (int) ((hours - wholeHours) * 60);

        System.out.println("\nEstimated travel time");
        System.out.println("———————————-");
        System.out.println("Hours:      " + wholeHours);
        System.out.println("Minutes:  " + minutes);

        System.out.println("\nBye!!");
        scanner.close();
    }
}
