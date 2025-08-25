public class binary_search {
    public static int helper(int[]arr,int start,int end,int x){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]<x){
            return helper(arr,mid+1,end,x);
        }
        else{
            return helper(arr,start,mid-1,x);
        }
    }
    public static void main(String[]args){
        int arr[]={1,3,4,6,7,9};
        int x=5;
        int idx=helper(arr,0,arr.length-1,x);
        if(idx==-1){
            System.out.println(x+" is not present.");
        }
        else{
            System.out.println(x+" is present at index "+idx);
        }
    }
}
