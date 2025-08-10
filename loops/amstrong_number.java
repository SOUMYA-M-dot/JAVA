//Checking whether a number is amstrong number or not
import java.util.*;
class amstrong_number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the number:");
        int x=sc.nextInt();
        int count=0,sum=0,rem, y=x, z=x;
        while(x>0){
            x=x/10;
            count++;
        }
        while(y>0){
            rem=y%10;
            sum=(int)(sum+Math.pow(rem,count));
            y=y/10;
        }
        if(sum==z){
            System.out.print(z+" is Amstrong number");
        }
        else{
            System.out.print(z+" is not Amstrong number");
        }
    }
}