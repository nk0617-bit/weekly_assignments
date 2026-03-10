import java.util.Scanner;

public class W3_L1_q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        // 1. Check if the number is a natural number (0 or positive)
        if (n >= 0) {
            // 2. Use the formula: sum = n * (n + 1) / 2
            int sum = n * (n + 1) / 2;
            
            // 3. Output for natural numbers
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            // 4. Output for non-natural numbers
            System.out.println("The number " + n + " is not a natural number");
        }
        
        input.close();
    }
}
