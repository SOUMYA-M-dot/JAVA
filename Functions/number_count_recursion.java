import java.util.Scanner;

public class number_count_recursion {
    public static int number_count(int n,int count){
        //base case    
        if(n==0){
            return count;
        }
        
        //body
        n=n/10;
        count++;

        //recursion call
        return number_count(n,count);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(number_count(num,0));
    }
}
