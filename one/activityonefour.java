package one;
import java.util.Scanner;
import java.lang.Math;

class ActivityOneFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 30;
        int min = 1;

        int computerChoice = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("Guess a number between " + min + " and " + max + ":");

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess > computerChoice) {
                System.out.println("Your guess is higher.");
            } else if (guess < computerChoice) {
                System.out.println("Your guess is lower.");
            } else {
                System.out.println("Your guess is correct! You win!");
                break;
            }

            if (i == 5) {
                System.out.println("You've used all attempts. The correct number was " + computerChoice + ".");
            }
        }
        scanner.close();
    }
}


