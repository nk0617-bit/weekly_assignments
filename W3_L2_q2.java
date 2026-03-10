import java.util.Scanner;

public class W3_L2_q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Take salary and years of service as input
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter your years of service: ");
        int years = input.nextInt();
        
        double bonus = 0;

        // 2. Check if years of service is more than 5
        if (years > 5) {
            // Calculate 5% bonus
            bonus = salary * 0.05;
            System.out.println("Congratulations! You are eligible for a 5% bonus.");
        } else {
            System.out.println("You are not yet eligible for a bonus.");
        }
        
        // 3. Print the bonus amount
        System.out.println("Your bonus amount is: " + bonus);
        
        input.close();
    }
}
