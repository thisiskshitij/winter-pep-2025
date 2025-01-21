/*
 Assignment for Now and this Weekend

Write an OOP Program to Simulate a To-do List.
using ArrayList as a Storage Solution.

Create a Menu Based Application as Follows :
1. Press 1 to Add a new To-do
2. Press 2 to List all Todo(s).
3. Press 3 To Delete a To-do

4. Press 4 to X Operation
 */

// package four;
// import java.util.ArrayList;

// public class assignment {
//     ArrayList<String> todo = new ArrayList<>();
// }


import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {

    // Main class to manage the to-do list
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>(); // Storage solution
        Scanner scanner = new Scanner(System.in); // Input reader
        int choice; // Menu choice variable

        // Menu loop
        do {
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add a new To-do");
            System.out.println("2. List all To-do(s)");
            System.out.println("3. Delete a To-do");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new To-do
                    System.out.print("Enter a new To-do: ");
                    String todo = scanner.nextLine();
                    todoList.add(todo);
                    System.out.println("To-do added successfully!");
                    break;

                case 2:
                    // List all To-do(s)
                    System.out.println("\n=== Your To-do List ===");
                    if (todoList.isEmpty()) {
                        System.out.println("No To-do(s) found!");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;

                case 3:
                    // Delete a To-do
                    System.out.println("\n=== Delete a To-do ===");
                    if (todoList.isEmpty()) {
                        System.out.println("No To-do(s) to delete!");
                    } else {
                        System.out.println("Select the To-do number to delete:");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                        System.out.print("Enter the number of the To-do to delete: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (index > 0 && index <= todoList.size()) {
                            String removedTodo = todoList.remove(index - 1);
                            System.out.println("To-do \"" + removedTodo + "\" deleted successfully!");
                        } else {
                            System.out.println("Invalid selection! Please try again.");
                        }
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the To-do List application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close(); // Close the scanner
    }
}
