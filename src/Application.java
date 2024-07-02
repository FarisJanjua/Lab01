import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Process CLI arguments
            String operation = args[0].toLowerCase();
            switch (operation) {
            //Checks for "add" typed in CLI, then takes two values the user types in the CLI and Adds them
                case "add":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + add(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to add");
                    }
                    break;
            //Checks for "subtract" typed in CLI, then takes two values the user types in the CLI and subtracts them
                case "subtract":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + subtract(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to subtract");
                    }
                    break;
                    //Checks for "multiply" typed in CLI, then takes two values the user types in the CLI and multiplies them
                case "multiply":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + multiply(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to multiply.");
                    }
                    break;
                  //Checks for "divide" typed in CLI, then takes two values the user types in the CLI and divides them
                case "divide":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to divide");
                    }
                    break;
                  //Checks for "factorial" typed in CLI, then takes one value the user types in the CLI and calculates the factorial
                case "factorial":
                    if (args.length == 2) {
                        double number = Double.parseDouble(args[1]);
                        System.out.println("Result: " + factorial(number));
                    } else {
                        System.out.println("Please provide one operand for the factorial operation.");
                    }
                    break;
                default:
                	//Check for unknown operation.
                    System.out.println("Unknown operation ");
                    break;
            }
        } else {
            // No CLI arguments, ask for user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide, factorial):");
            String operation = scanner.next();

            // Our switch is checking to see which operation is used via the Scanner class, and performing the task.
            // Important note is the break, this allows the code to only perform the given task, and not carry on with all the tasks afterwards
            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Enter the first operand:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case "subtract":
                    System.out.println("Enter the first operand:");
                    double num3 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double num4 = scanner.nextDouble();
                    System.out.println("Result: " + subtract(num3, num4));
                    break;
                case "multiply":
                    System.out.println("Enter the first operand:");
                    double num5 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double num6 = scanner.nextDouble();
                    System.out.println("Result: " + multiply(num5, num6));
                    break;
                case "divide":
                    System.out.println("Enter the first operand:");
                    double num7 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double num8 = scanner.nextDouble();
                    System.out.println("Result: " + divide(num7, num8));
                    break;
                case "factorial":
                    System.out.println("Enter a number:");
                    double number = scanner.nextDouble();
                    System.out.println("Result: " + factorial(number));
                    break;
                default:
                	//Check for unknown operation.
                    System.out.println("Unknown operation chosen");
                    break;
            }
        }
    }

    // Adds two doubles, takes two arguments as doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtracts two doubles, takes two arguments as doubles
    public static double subtract(double c, double d) {
        return c - d;
    }

    // Multiplies two doubles, takes two arguments as doubles
    public static double multiply(double e, double f) {
        return e * f;
    }

    // Divides two doubles, takes two arguments as doubles
    public static double divide(double g, double h) {
        return g / h;
    }

    // Performs factorial of a double, takes one argument as a double
    public static double factorial(double n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

