import java.util.Scanner;

public class W3_L2_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Get integer input and check for Natural Number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number >= 1) {
            // b. Using a for loop, iterate from 1 to the number
            for (int i = 1; i <= number; i++) {
                
                // c. Check if current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        input.close();
    }
}
