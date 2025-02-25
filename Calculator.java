import java.util.Scanner;

public class Calculator {

    // Method to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Return Not-a-Number for division by zero
        }
        return num1 / num2;
    }
    public static void displayMenu() {
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        
        while (keepRunning) {
            displayMenu();
            
            // Get the user's choice
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                keepRunning = false; // Exit the loop if user chooses 5
            } else {
                // Get two numbers from the user
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                
                // Perform the chosen operation
                double result = 0;
                switch(choice)
                 {
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        continue;
                }
                System.out.println("The result is: " + result);
            }
        }
        
        scanner.close();
    }
}
