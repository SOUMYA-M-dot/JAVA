import java.util.*;
public class remove_duplicates {
    public static int[] helper(int[] arr){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int soumya[]=new int[set.size()];
        int idx=0;
        for(Integer i:set){
            soumya[idx]=i;
            idx++;
        }
        return soumya;
    }
    public static void main(String[]args){
        int arr[]={2,5,6,2,5,1,7,6,2,6,10};
        //if length of array is 'n', then all elements of the array must lie within 1-n;
        int[] final_arr=helper(arr);
        for(int i=0;i<final_arr.length;i++){
            System.out.print(final_arr[i]+" ");
        }
    }
}
