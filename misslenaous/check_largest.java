import java.util.*;
class check_largest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int m=sc.nextInt();
        System.out.println("Enter the second number:");
        int n=sc.nextInt();
        System.out.println("Enter the third number:");
        int o=sc.nextInt();
        int largest;
        if (m>= n && m>= o) {
            largest = m;
        } else if (n >= m && n >= o) {
            largest = n;
        } else {
            largest = o;
        }
           System.out.println("The largest number is: " + largest);

    }
}