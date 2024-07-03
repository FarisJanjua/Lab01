import java.util.Scanner;
import java.lang.Math;

public class Application {
    public static void main(String[] args) {
        // Command Line Interface (CLI) part
        if (args.length > 0) {
            String operation = args[0].toLowerCase();
            switch (operation) {
                case "add":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + add(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to add.");
                    }
                    break;
                case "subtract":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + subtract(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to subtract");
                    }
                    break;
                case "multiply":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + multiply(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to multiply");
                    }
                    break;
                case "divide":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Please provide two operands to divide");
                    }
                    break;
                case "pow":
                    if (args.length == 3) {
                        double base = Double.parseDouble(args[1]);
                        double exponent = Double.parseDouble(args[2]);
                        System.out.println("Result: " + power(base, exponent));
                    } else {
                        System.out.println("Please provide two operands for the pow operation.");
                    }
                    break;
                case "sqrt":
                    if (args.length == 2) {
                        double number = Double.parseDouble(args[1]);
                        System.out.println("Result: " + sqrt(number));
                    } else {
                        System.out.println("Please provide one operand for the sqrt operation.");
                    }
                    break;
                case "log":
                    if (args.length == 2) {
                        double number = Double.parseDouble(args[1]);
                        System.out.println("Result: " + log(number));
                    } else {
                        System.out.println("Please provide one operand for the log operation.");
                    }
                    break;
                case "log10":
                    if (args.length == 2) {
                        double number = Double.parseDouble(args[1]);
                        System.out.println("Result: " + log10(number));
                    } else {
                        System.out.println("Please provide one operand for the log10 operation.");
                    }
                    break;
                case "sin":
                    if (args.length == 2) {
                        double angleDegrees = Double.parseDouble(args[1]);
                        System.out.println("Result: " + sin(angleDegrees));
                    } else {
                        System.out.println("Please provide one operand for the sin operation.");
                    }
                    break;
                case "cos":
                    if (args.length == 2) {
                        double angleDegrees = Double.parseDouble(args[1]);
                        System.out.println("Result: " + cos(angleDegrees));
                    } else {
                        System.out.println("Please provide one operand for the cos operation.");
                    }
                    break;
                case "tan":
                    if (args.length == 2) {
                        double angleDegrees = Double.parseDouble(args[1]);
                        System.out.println("Result: " + tan(angleDegrees));
                    } else {
                        System.out.println("Please provide one operand for the tan operation.");
                    }
                    break;
                case "factorial":
                    if (args.length == 2) {
                        int number = Integer.parseInt(args[1]);
                        System.out.println("Result: " + factorial(number));
                    } else {
                        System.out.println("Please provide one operand for the factorial operation.");
                    }
                    break;
                    //check for unkown operation
                default:
                    System.out.println("Unknown operation chosen");
                    break;
            }
        } else {
            // Interaction block
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nEnter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial) or 'exit' to quit:");
                String operation = scanner.next();
                if (operation.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting calculator...");
                    break;
                }
                // For operations requiring two inputs
                if (!operation.equalsIgnoreCase("sqrt") && !operation.equalsIgnoreCase("log") && !operation.equalsIgnoreCase("log10") && !operation.equalsIgnoreCase("sin") && !operation.equalsIgnoreCase("cos") && !operation.equalsIgnoreCase("tan") && !operation.equalsIgnoreCase("factorial")) {
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    
                    switch (operation.toLowerCase()) {
                        case "add":
                            System.out.println("Result: " + add(num1, num2));
                            break;
                        case "subtract":
                            System.out.println("Result: " + subtract(num1, num2));
                            break;
                        case "multiply":
                            System.out.println("Result: " + multiply(num1, num2));
                            break;
                        case "divide":
                            System.out.println("Result: " + divide(num1, num2));
                            break;
                        case "pow":
                            System.out.println("Result: " + power(num1, num2));
                            break;
                        default:
                            System.out.println("Invalid operation.");
                            break;
                    }
                } else {
                    // For operations requiring one input
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    switch (operation.toLowerCase()) {
                        case "sqrt":
                            System.out.println("Result: " + sqrt(num));
                            break;
                        case "log":
                            System.out.println("Result: " + log(num));
                            break;
                        case "log10":
                            System.out.println("Result: " + log10(num));
                            break;
                        case "sin":
                            System.out.println("Result: " + sin(num));
                            break;
                        case "cos":
                            System.out.println("Result: " + cos(num));
                            break;
                        case "tan":
                            System.out.println("Result: " + tan(num));
                            break;
                        case "factorial":
                            System.out.println("Result: " + factorial((int) num));
                            break;
                            //checks for uknown operation, prints on users console if unkown operation chosen
                        default:
                            System.out.println("Invalid operation.");
                            break;
                    }
                }
            }
            scanner.close();
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

    // Exponentiation
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square root
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    // Natural logarithm
    public static double log(double number) {
        return Math.log(number);
    }

    // Base-10 logarithm
    public static double log10(double number) {
        return Math.log10(number);
    }

    // Sine function using Math class
    public static double sin(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    // Cosine function using math class
    public static double cos(double angleDegrees) {     
        return Math.cos(Math.toRadians(angleDegrees));
    }

    // Tangent function using Math class
    public static double tan(double angleDegrees) {
        return Math.tan(Math.toRadians(angleDegrees));
    }

    // Factorial calculation/  with progress display
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial of negative number is undefined.");
            return 0;
        }
        return factorialHelper(num, num);
    }

    private static long factorialHelper(int originalNum, int num) {
        if (num <= 1) {
            System.out.print("\rCalculating factorial: 100%\n");
            return 1;
        }

        // Calculate progress /update progress bar
        int progress = (int) (((originalNum - num) / (double) originalNum) * 100);
        System.out.print("\rCalculating factorial: " + progress + "%\n");

        return num * factorialHelper(originalNum, num - 1);
    }
}
