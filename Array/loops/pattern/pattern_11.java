

import java.util.Scanner;

public class pattern_11{

    public static void main(String[]args){

        /*
             *
            * *
           * * *
          * * * *
         * * * * * 
          * * * *
           * * *    
            * *
             *
        */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for (int i= n - 1; i >= 1; i--) {
            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
        
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
