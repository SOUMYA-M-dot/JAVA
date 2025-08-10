import java.util.*;
public class check_frequency {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        System.out.println("Enter the digit:");
        int y=sc.nextInt();
        int rem,count=0;
        while(x>0){
            rem=x%10;
            if(rem==y){
                count++;
            }
            x=x/10;
        }
        System.out.println(count);
    }
}
