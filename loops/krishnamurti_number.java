import java.util.*;
public class krishnamurti_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int x=num,y=num;
        int count=0,sum=0,rem;
        while(num>0){
            num/=10;
            count++;
        }
        while(x>0){
            rem=x%10;
            sum=(int)(sum+Math.pow(rem,count));
            x/=10;
            count--;
        }
        if(sum==y){
            System.out.println("Krishnamurti Numbber");
        }
        else{
            System.out.println("Not a Krishnamurti Number.");
        }
    }
}