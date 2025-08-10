//factorial using function
import java.util.*;
public class factorial{
    public static int factorial(int x){
        int product=1;
        for(int i=2;i<=x;i++){
            product=product*i;
        }
        return product;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(factorial(a));
    }
}
