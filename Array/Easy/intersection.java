import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={2,4,6,8,10};
        int arr2[]={5,6,8,9,11,13};
        int arr3[]=new int[Math.min(arr1.length,arr2.length)];
        int idx=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3[idx]=arr1[i];
                    idx++;
                }
            }
        }
        System.out.println("The Intersection of two arrays is:");
        for(int z=0;z<idx;z++){
            System.out.print(arr3[z]+",");
        }
    }
}
