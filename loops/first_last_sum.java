import java.util.*;
public class first_last_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rem1=num%10;
        int sum=0,rem;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        int rem2=sum%10;
        System.out.println(rem1+rem2);
    }
}