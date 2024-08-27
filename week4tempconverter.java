package temperatureConversion;

public class TemperatureConversion


import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Temperature Converter");
        
        System.out.print("Enter degrees in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Degrees in Celsius: " + celsius);
        
        System.out.print("Enter degrees in Celsius: ");
        celsius = scanner.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Degrees in Fahrenheit: " + fahrenheit);
        
        System.out.println("Bye!!");
        
        scanner.close();
    }
}

