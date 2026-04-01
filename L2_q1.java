import java.util.Scanner;

public class L2_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] oldSalaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonusAmounts = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        System.out.println("--- Enter Employee Data ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("  Years of Service: ");
            double years = scanner.nextDouble();
            System.out.print("  Current Salary: ");
            double salary = scanner.nextDouble();
            if (years < 0 || salary < 0) {
                System.out.println("  Invalid input! Please enter positive values.");
                i--;
            } else {
                yearsOfService[i] = years;
                oldSalaries[i] = salary;
            }
        }

        for (int i = 0; i < 10; i++) {
            double rate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            
            bonusAmounts[i] = oldSalaries[i] * rate;
            newSalaries[i] = oldSalaries[i] + bonusAmounts[i];
            
            totalOldSalary += oldSalaries[i];
            totalBonus += bonusAmounts[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Final Company Report ---");
        System.out.printf("Total Old Salary Payout: $%.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout:     $%.2f%n", totalBonus);
        System.out.printf("Total New Salary Payout: $%.2f%n", totalNewSalary);

        scanner.close();
    }
}
