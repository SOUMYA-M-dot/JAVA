import java.util.*;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end term:");
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        while(c<=n){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
