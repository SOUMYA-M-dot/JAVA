

import java.util.Scanner;

public class pattern_8{

    public static void main(String[]args){

        /*
        ****
        ****
        ****
        ****
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || j==n-i+1){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}