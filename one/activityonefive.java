package one;
import java.util.Scanner;

// # & Activity 5 ( Targets : String Manipulation)

// you are provided with Student Marks :
// String marks="English 50 Science 76 Maths 90";
// Using Above Data Provided Find
// Sum of All Marks
// - Avg of Marks


class activityonefive{
    
        public static void main(String[] args) {
            String marks = "English 50 Science 76 Maths 90";
    
            String[] parts = marks.split(" ");
    
            int sum = 0;
            int count = 0;
    
            for (String part : parts) {
                try {
                    int mark = Integer.parseInt(part);
                    sum += mark;
                    count++;
                } catch (NumberFormatException e) {
                   
                }
            }
    
            double average = (double) sum / count;
    
            System.out.println("Sum of Marks: " + sum);
            System.out.println("Average of Marks: " + average);
        }
    }
    