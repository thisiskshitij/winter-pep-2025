package one;
import java.util.Scanner;

public class activityonetwo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter BASIC PAY: ");
        double basic = scanner.nextDouble();
        
        
        if(basic>=5000){
            System.out.println(basic*12 + basic*14 +basic);
        }

        if(basic<5000){
            System.out.println(basic*16 + basic*18 +basic);
        }

    } 
}
