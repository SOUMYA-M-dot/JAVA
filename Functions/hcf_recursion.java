import java.util.Scanner;

public class hcf_recursion {
    public static int GCD(int num1,int num2){
        //base case    
        if(num2==0){
            return num1;
        }
        //recursion call
        return GCD(num2,num1%num2);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(GCD(num1,num2));
    }
}
