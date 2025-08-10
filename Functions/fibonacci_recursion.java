import java.util.Scanner;

public class fibonacci_recursion {
    public static void fibonacci(int n,int a,int b){
        //base case    
        if(a>n){
            return;
        }

        //body
        System.out.print(a+" ");
        
        //recursion call
        fibonacci(n,b,a+b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int num=sc.nextInt();
        fibonacci(num,0,1);
    }
}
