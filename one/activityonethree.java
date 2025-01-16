package one;
import java.util.Scanner;
class activityonethree{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        
        String ch = "r";
        String repeatedString = ch.repeat(len);
        System.out.println("Enter burp length: ");

        System.out.println("bu"+repeatedString+"p");
    }
    
}