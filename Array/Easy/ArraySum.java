import java.util.*;
public class ArraySum {
    public static int sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr));
    }
}