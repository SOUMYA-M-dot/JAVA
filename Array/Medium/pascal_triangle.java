import java.util.*;
public class pascal_triangle {
    public static int[] helper(int[] arr){
        int helper[]=new int[arr.length+1];
        helper[0]=1;
        helper[helper.length-1]=1;
        for(int i=1;i<arr.length;i++){
            helper[i]=arr[i]+arr[i-1];
        }
        return helper;
    }
    public static void main(String[]args){
        int arr[]={1,5,10,10,5,1};
        //if length of array is 'n', then all elements of the array must lie within 1-n;
        int[] final_arr=helper(arr);
        for(int i=0;i<final_arr.length;i++){
            System.out.print(final_arr[i]+" ");
        }
    }
}
