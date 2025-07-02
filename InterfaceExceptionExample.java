import java.util.Scanner;

interface Calculator {
    int divide(int a, int b) throws ArithmeticException;
}

class SimpleCalculator implements Calculator {
    @Override
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}

public class InterfaceExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new SimpleCalculator();

        try {
            System.out.print("Enter numerator (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter denominator (b): ");
            int b = scanner.nextInt();

            int result = calc.divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integer values.");
        } finally {
            scanner.close();
        }
    }
}
