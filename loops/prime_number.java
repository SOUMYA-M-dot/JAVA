import java.util.*;
 class prime_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
          boolean isPrime = true;
           if (number <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
