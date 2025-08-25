public class bubble_sort {
    public static int[] helper(int[] arr,int n){
        if(n==1){
            return arr;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int swap=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=swap;
            }
        }
        return helper(arr,n-1);
    }
    public static void main(String[]args){
        int arr[]={5,2,9,7,6,1,4};
        int[] final_arr=helper(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
