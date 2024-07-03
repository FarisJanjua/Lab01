import java.util.Scanner;
import java.lang.Math;

public class Application {
    public static void main(String[] args) {
        // Command Line Interface (CLI) part
    	/*this allows the user to test out the program directly from the Command line. We set two doubles to args[1] args[2]
    	pertaining to the users first and second input, */
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
                case "permutation":
                    if (args.length == 3) {
                        int totalNumInArray = Integer.parseInt(args[1]);
                        int numSelected = Integer.parseInt(args[2]);
                        System.out.println("Result: " + perm(totalNumInArray, numSelected));
                    } else {
                        System.out.println("Please provide two operands for the permutation operation.");
                    }
                    break;
                default:
                    System.out.println("Unknown operation chosen");
                    break;
            }
        } else {
            // Interaction block
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nEnter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial, permutation) or 'exit' to quit:");
                String operation = scanner.next();
                if (operation.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting calculator...");
                    break;
                }
                if (operation.equalsIgnoreCase("permutation")) {
                    System.out.print("Enter total number of items: ");
                    int totalNumInArray = scanner.nextInt();
                    System.out.print("Enter number of items to be selected: ");
                    int numSelected = scanner.nextInt();
                    System.out.println("Result: " + perm(totalNumInArray, numSelected));
                } else {
                    // For operations requiring two inputs
                    if (!operation.equalsIgnoreCase("sqrt") && !operation.equalsIgnoreCase("log") && !operation.equalsIgnoreCase("log10") && !operation.equalsIgnoreCase("sin") && !operation.equalsIgnoreCase("cos") && !operation.equalsIgnoreCase("tan") && !operation.equalsIgnoreCase("factorial")) {
                        System.out.print("Enter first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = scanner.nextDouble();
                      
                        /*switch operation helps us with identifying which value the user inputs. The catch with using this method, is that 
                        without a break, it will execute all the remaining values after the desired case is chosen. This is where "break" comes in. break stops this and stops the
                        execution of the remaining cases from going through.*/
                      //This is for operations with two arguments
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
                    	//Same Switch operation is applied as above.
                    	//This is for operations with only one argument
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
                            default:
                                System.out.println("Invalid operation.");
                                break;
                        }
                    }
                }
            }
            scanner.close();
        }
    }

    // Adds two doubles, Additon method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtracts two doubles, Subtraction method
    public static double subtract(double c, double d) {
        return c - d;
    }

    // Multiplies two doubles, Multiplication method
    public static double multiply(double e, double f) {
        return e * f;
    }

    // Divides two doubles , dividing Method
    public static double divide(double g, double h) {
        return g / h;
    }
 
    // Exponentiation Method
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square root Method
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    // Natural logarithm Method
    public static double log(double number) {
        return Math.log(number);
    }

    // Base-10 logarithm Method
    public static double log10(double number) {
        return Math.log10(number);
    }

    // Sine Method
    public static double sin(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    // Cosine Method
    public static double cos(double angleDegrees) {     
        return Math.cos(Math.toRadians(angleDegrees));
    }

    // Tangent Method
    public static double tan(double angleDegrees) {
        return Math.tan(Math.toRadians(angleDegrees));
    }

    // Factorial Method
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
           
        	result *= i;
        }
        return result;
    }

    // Permutation function
    public static double perm(int totalNumInArray, int numSelected) {
        //Conditions
        if (totalNumInArray < 0) {
            System.out.println("Sorry, invalid number of items.");
            return 0;
        }
        if (numSelected < 0 || numSelected > totalNumInArray || numSelected > 100) {
            System.out.println("Sorry, the selected items exceed the total or invalid input, try again.");
            return 0;
        }
        
        if (numSelected == 0) {
            return 1;
        }

        return totalNumInArray * perm(totalNumInArray - 1, numSelected - 1);
    }
}

