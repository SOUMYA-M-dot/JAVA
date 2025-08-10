import java.util.*;
class simple_calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
             System.out.println("Enter the first number: ");
            int x=sc.nextInt();
            System.out.println("Enter the second number: ");
            int y=sc.nextInt();
            System.out.println("Enter the operator: ");
            char ch=sc.next().charAt(0);
            if(ch=='+'){
                System.out.println("Addition of two numbers is: "+(x+y));
            }
            else if(ch=='-'){
                System.out.println("Subtraction of two numbers is: "+(x-y));
            }
            else if(ch=='*'){
                System.out.println("Multiplication of two numbers is: "+(x*y));
            }
            else if(ch=='/'){
                System.out.println("Quotient after dividing two numbers is: "+(x/y));
            }
            else if(ch=='%'){
                System.out.println("Remainder after dividing two numbers is: "+(x%y));
            }
        }
       
    }
}