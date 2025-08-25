
import java.util.Scanner;

class number_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input character
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        
        
        
    }
}
