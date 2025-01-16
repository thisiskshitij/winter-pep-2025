package one;
// & Activity 7 ( Targets : Problem Solving)

// Hailstone Sequence Algorithm ( The Objective is to Translate the Given Algorithm into Java CODE)
// -1 Take a Number say (n) as Input.
// -2 Print the Value of n
// -3 while n != 1
//     3.1 Print the value of n
//     3.2 if n is odd , calculate the next number as n*3+1
//     3.3 if n is even, calculate the next number as n/2

// Test Case:
// if n is 10 : output: 10 5 16 8 4 2 1
// if n is 17 : output: 17 52 26 13 40 20 10 5 16 8 4 2 1

import java.util.Scanner;
public class activityoneseven
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // System.out.println(n+" ");
        while(n!=1){
            if (n%2==0){
                n=n/2;
                System.out.println(n+"");
            }
            else if (n%2!=0){
                n=n*3+1;
                System.out.println(n+"");
            }
        }

    }
}

