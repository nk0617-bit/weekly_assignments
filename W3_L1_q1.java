import java.util.Scanner;

public class W3_L1_q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check divisibility and store the result
        String result;
        if (number % 5 == 0) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println("Is the number " + number + " divisible by 5? " + result);
        
        input.close();
    }
}
