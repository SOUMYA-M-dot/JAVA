import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={2,4,6,8,10};
        int arr2[]={5,6,8,9,11,13};
        int arr3[]=new int[arr1.length+arr2.length];
        int idx=0;
        for(int i=0;i<arr1.length;i++){
            arr3[idx]=arr1[i];
            idx++;
        }
        int count;
        for(int s=0;s<arr2.length;s++){
            count=0;
            for(int j=0;j<idx;j++){
                if(arr2[s]==arr3[j]){
                    count++;
                }
            }
            if(count==0){
                arr3[idx]=arr2[s];
                idx++;
            }
        }
        System.out.println("The Union of two arrays is:");
        for(int z=0;z<idx;z++){
            System.out.print(arr3[z]+",");
        }
    }
}
