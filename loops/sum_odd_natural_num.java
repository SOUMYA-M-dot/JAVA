import java.util.Scanner;

public class sum_odd_natural_num {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
         int n= sc.nextInt();

        int sum=0,count=1;
        for( int i=1;count<=n;i=i+2){
            sum=sum+i;
            count++;
        }
        System.out.println(sum);
        
    }
}
        


