//factorial using recursion 
import java.util.Scanner;
public class factorial_recursion {
    public static int factorial(int x){
        //base case    
        if(x==1){
            return 1;
        }
        //body
        //recursion call
        return x*factorial(x-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(factorial(a));
    }
}
