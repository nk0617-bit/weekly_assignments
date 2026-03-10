import java.util.Scanner;

public class W3_L2_q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // a. Take integer input and store it in the variable number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // b. Using a for loop, find the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            
            // Print in the format number * i = ____
            System.out.println(number + " * " + i + " = " + result);
        }
        
        input.close();
    }
}
