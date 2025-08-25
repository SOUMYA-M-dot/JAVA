import java.util.*;
public class palindrome_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        String reversed = "";
        for(int i=input.length()-1;i>=0;i--){
            reversed = reversed + input.charAt(i);
            }
            if(input.equals(reversed)){
                System.out.println("The input is a palindrome.");
                }
                else{
                    System.out.println("The input is not a palindrome.");
                    }

                    }
                    
                }

       

        
