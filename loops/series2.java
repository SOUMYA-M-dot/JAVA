import java.util.Scanner;

public class series2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        int start=1,mul=2;
        while(start<=n){
            System.out.print(start+" ");
            start=start*mul;
            mul++;
        }
    }
}
