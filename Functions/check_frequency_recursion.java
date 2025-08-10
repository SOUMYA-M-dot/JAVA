import java.util.Scanner;

public class check_frequency_recursion{
    public static int check_frequency(int num,int digit,int count){
        //base case    
        if(num==0){
            return count;
        }
        //body
        int rem=num%10;
        if(rem==digit){
            count++;
        }
        //recursion call
        return check_frequency(num/10,digit,count);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the digit:");
        int digit=sc.nextInt();
        System.out.println(check_frequency(num,digit,0));
    }
}
