import java.util.*;
public class sum {
    //function definition
    public static int sum(int x,int y){// x and y are formal parameters
        System.out.println("Soumya is a bad girl.");
        return x+y;
    }
    public static void main(String[]args){//caller of main method-JVM(Java Virtual Machine)
        //function call
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();//a and b are actual parameters
        System.out.println(sum(a,b));
    }
}
