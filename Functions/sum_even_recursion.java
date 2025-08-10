import java.util.Scanner;

public class sum_even_recursion {
    public static int sum_even(int n,int k,int num,int sum){
        //base case    
        if(k==n){
            return sum;
        }
        //body
        num=num+2;
        sum=sum+num;
        k++;
        //recursion call
        return sum_even(n,k,num,sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        System.out.println(sum_even(n,0,0,0));
    }
}
