import java.util.Scanner;
public class pattern_5{

    public static void main(String[]args){
        int x=1;
        /*
        1
        2 3
        4 5 6 
        7 8 9 10
        */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
