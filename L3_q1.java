import java.util.Scanner;

public class L3_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long inputNumber = scanner.nextLong();
        long tempNumber = Math.abs(inputNumber); 

        int digitCount = String.valueOf(tempNumber).length();
        int[] digitsArray = new int[digitCount];
        long extractionTemp = tempNumber;
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = (int) (extractionTemp % 10);
            extractionTemp /= 10;
        }

        int[] frequency = new int[10];
        for (int digit : digitsArray) {
            frequency[digit]++;
        }
        System.out.println("\n--- Digit Frequencies ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s).");
            }
        }

        scanner.close();
    }
}
