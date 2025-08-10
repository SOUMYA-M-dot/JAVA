import java.util.*;
public class linear_search {
    public static int LinearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //Time complexity of Linear Search is O(n)
        Scanner sc=new Scanner(System.in);
        int arr[]={43,75,90,6,16,22};
        System.out.print("Enter the element to be searched:");
        int x=sc.nextInt();
        if(LinearSearch(arr,x)==-1){
            System.out.println(x+" is not present.");
        }
        else{
            System.out.println(x+" is present at index "+LinearSearch(arr,x));
        }
    }
}
