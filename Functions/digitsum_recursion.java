public class digitsum_recursion {
    public static int helper(int num,int sum){
        //Base Case
        if(num==0){
            return sum;
        }

        //Body
        sum=sum+num%10;
        num=num/10;

        //Recursive call
        return helper(num,sum);
    }
    public static void main(String[]args){
        int x=12345;
        int final_val=helper(x,0);
        System.out.println(final_val);
    }
}
