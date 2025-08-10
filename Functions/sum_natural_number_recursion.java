//factorial using recursion 
import java.util.Scanner;
public class sum_natural_number_recursion {
    public static int sum(int x){
        //base case    
        if(x==1){
            return 1;
        }
        //body
        //recursion call
        return x+sum(x-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(sum(a));
    }
}

