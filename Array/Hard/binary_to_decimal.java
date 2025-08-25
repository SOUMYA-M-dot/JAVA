import java.util.*;
public class binary_to_decimal{
    public static int helper(int x){
        ArrayList<Integer>list=new ArrayList<>();
        while(x>0){
            list.add(x%10);
            x=x/10;
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1){
                sum=sum+(int)Math.pow(2,i);
            }
        }
        return sum;
    }
    public static void main(String[]args){
        int x=110101;
        int final_ans=helper(x);
        System.out.println(final_ans);
    }
}
