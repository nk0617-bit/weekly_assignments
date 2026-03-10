import java.util.Scanner;

public class W3_L1_q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Get three numbers from the user
        System.out.print("Enter number 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = input.nextInt();

        // 2. Perform the checks using ternary operators for cleaner code
        String firstCheck = (n1 >= n2 && n1 >= n3) ? "Yes" : "No";
        String secondCheck = (n2 >= n1 && n2 >= n3) ? "Yes" : "No";
        String thirdCheck = (n3 >= n1 && n3 >= n2) ? "Yes" : "No";

        // 3. Print the output exactly as requested
        System.out.println("Is the first number the largest? " + firstCheck);
        System.out.println("Is the second number the largest? " + secondCheck);
        System.out.println("Is the third number the largest? " + thirdCheck);

        input.close();
    }
}
