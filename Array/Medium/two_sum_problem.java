import java.util.*;

class two_sum_problem{
    public static void helper(int[] arr,int sum){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
    public static void main(String[]args){
        int sum=11;
        int arr[]={5,2,9,7,6,1,4};
        helper(arr,sum);
    }
}