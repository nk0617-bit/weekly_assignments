import java.util.Scanner;

public class W1_L3_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Create a celsius variable and take user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // b. Use the Formulae and assign to farenheitResult
        double farenheitResult = (celsius * 9 / 5) + 32;

        // O/P => The ____ celsius is ____ fahrenheit.
        System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit.");
        
        input.close();
    }
}
