import java.util.Scanner;

public class oop {
    public static double average(int sum, int len) {
        if (len == 0) {
            return 0; // Avoid division by zero
        }
        return sum / len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0; 
        int count = 0; 
        int[] arr = new int[20]; 

        // Input loop
        for (int i = 0; i < arr.length; i++) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr[i] = num;
            sum += num;
            count++;
        }

        System.out.println("Average: " + average(sum, count));
    }
}
