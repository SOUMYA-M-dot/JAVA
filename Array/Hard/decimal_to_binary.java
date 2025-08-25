import java.util.*;
public class decimal_to_binary{
    public static int helper(int x){
        ArrayList<Integer>list=new ArrayList<>();
        while(x>0){
            list.add(x%2);
            x=x/2;
        }
        int sum=0;
        for(int i=list.size()-1;i>=0;i--){
            sum=sum*10+list.get(i);
        }
        return sum;
    }
    public static void main(String[]args){
        int x=17;
        int final_ans=helper(x);
        System.out.println(final_ans);
    }
}
