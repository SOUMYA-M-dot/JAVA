import java.util.Scanner;

public class number_sum_recursion {
    public static int number_sum(int n,int sum){
        //base case    
        if(n==0){
            return sum;
        }
        
        //body
        int rem = n%10;
        sum=rem+sum;
        

        //recursion call
        return number_sum(n/10,sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(number_sum(num,0));
    }
}
