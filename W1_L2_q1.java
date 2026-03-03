import java.util.Scanner;

public class W1_L2_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Create variables and take user inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // b. Perform Arithmetic Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // O/P => Final printed result
        System.out.print("The addition, subtraction, multiplication, and division value of 2 numbers ");
        System.out.println(number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
        
        input.close();
    }
}
