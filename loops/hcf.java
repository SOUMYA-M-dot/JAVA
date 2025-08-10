import java.util.Scanner;

public class hcf {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two terms:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        while (b>0) {
            temp=a;
            a=b;
            b=temp%b;
            
        }
        System.out.println(a);
        
    }
}
