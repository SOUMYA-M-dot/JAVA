import java.util.Scanner;

public class series1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        int start=1,adder=1;
        while(start<=n){
            System.out.print(start+" ");
            start=start+adder;
            adder++;
        }
    }
}
