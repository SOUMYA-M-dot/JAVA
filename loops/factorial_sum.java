import java.util.Scanner;

public class factorial_sum {
    public static int factorial(int x) {
        int fact=1;
        for(int i=2;i<=x;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+factorial(i);
            }
            else{
                sum=sum-factorial(i);
            }
        }
        System.out.println(sum);
    }
}
