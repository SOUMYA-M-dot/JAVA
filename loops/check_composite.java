import java.util.Scanner;

public class check_composite
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        //
        if (n <= 1) {
            System.out.println(n+ " is neither prime nor composite.");
        } else if (isComposite(n)) {
            System.out.println(n + " is a composite number.");
        } else {
            System.out.println(n + " is not a composite number.");
        }

        scanner.close();
    }

    // Function to check if number is composite
    public static boolean isComposite(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true; // Has a divisor, so it's composite
            }
        }
        return false; // No divisors, so not composite
    }
}
