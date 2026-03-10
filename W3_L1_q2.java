import java.util.Scanner;

public class W3_L1_q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Get three numbers from the user
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();
        
        // 2. Check if the first is smaller than or equal to both others
        String result;
        if (num1 <= num2 && num1 <= num3) {
            result = "Yes";
        } else {
            result = "No";
        }
        
        // 3. Print the output as requested
        System.out.println("Is the first number the smallest? " + result);
        
        input.close();
    }
}
