import java.util.Scanner;
public class pattern_6{

    public static void main(String[]args){
        /*
        1
        1 2
        1 2 3      n=4    
        1 2 3 4
        */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
          
            }
            System.out.println();
        }
    }
}