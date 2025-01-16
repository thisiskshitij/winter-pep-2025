package one;
import java.util.Scanner;

public class activityoneone {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        
        double kilograms = pounds * 0.453592;
        
        System.out.printf("%.2f pounds is equal to %.2f kilograms.%n", pounds, kilograms);
        
        scanner.close();
    }
}
