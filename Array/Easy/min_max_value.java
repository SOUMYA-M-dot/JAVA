import java.util.Scanner;

public class min_max_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={43,75,90,6,16,22};
        int max=arr[0],min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum value of array is "+min+" and maximum value is "+max);
    }
}
