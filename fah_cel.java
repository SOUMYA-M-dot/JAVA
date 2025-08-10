import java.util.*;
class fah_cel{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        // //celcius to Fahrenheit
        // System.out.println("Enter the temperature in celcius");
        // int x=sc.nextInt();
        // double F=(1.8)*x+32;
        // System.out.println(x+" celcius is equal to "+F+" Fahrenheit");
        System.out.println("Enter the temperature in fahrenite");
        int x=sc.nextInt();
        double C=(5.0/9.0)*(x-32);
        System.out.println(x+" Fahrenheit is equal to "+C+" celcius");
        
    }
}
