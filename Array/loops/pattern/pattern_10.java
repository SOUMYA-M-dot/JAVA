import java.util.Scanner;
public class pattern_10{

    public static void main(String[]args){

        /*
        
             
        */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of stars:");
        int n=sc.nextInt();
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && (j+1)%4==0){
                    System.out.print("*");
                }
                else if(i==2 && j%2==0){
                    System.out.print("*");
                }
                else if(i==3 && (j-1)%4==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
