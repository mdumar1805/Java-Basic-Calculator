import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        // 1. Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // 2. Prompt the user for the first number
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        // 3. Prompt the user for the operator
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        // 4. Prompt the user for the second number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result;

        // 5. Use a switch statement to perform the calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }

        // 6. Close the scanner to prevent resource leaks
        scanner.close();
    }
}