// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class check_perfect_square  {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      int x = sc.nextInt();
      double y = Math.sqrt(x);
      if(y==Math.ceil(y)){
        System.out.println("It is a perfect square");
      }
      else{
        System.out.println("Not a perfect square");
      }
   }
}
