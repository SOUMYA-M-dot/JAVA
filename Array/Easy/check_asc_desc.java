import java.util.Scanner;

public class check_asc_desc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={8,8,8,8,8};
        int asc=0,desc=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                asc++;
            }
            else if(arr[i]>arr[i+1]){
                desc++;
            }
        }
        if(asc!=0 && desc!=0){
            System.out.println("Unsorted");
        }
        else if(desc==0 && asc!=0){
            System.out.println("Ascending.");
        }
        else if(desc!=0 && asc==0){
            System.out.println("Descending.");
        }
        else{
            System.out.println("Equal Array.");
        }
    }
}
