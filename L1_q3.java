import java.util.Scanner;

public class L1_q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to see its multiplication table: ");
        int number = scanner.nextInt();
        int[] results = new int[10];

        for (int i = 0; i < 10; i++) {
            results[i] = number * (i + 1);
        }

        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }

        scanner.close();
    }
}
