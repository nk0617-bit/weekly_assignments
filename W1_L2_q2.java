import java.util.Scanner;

public class W1_L2_q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // I/P => base, height
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Calculate Area in sq cm
        double areaSqCm = 0.5 * base * height;

        // Convert Area to sq in (1 sq in = 2.54 * 2.54 sq cm)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // O/P => Final result format
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        
        input.close();
    }
}
