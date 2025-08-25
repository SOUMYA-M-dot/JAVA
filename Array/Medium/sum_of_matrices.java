public class sum_of_matrices {
    public static int[][] helper(int[][] arr1,int[][] arr2){
        int rows=arr1.length;
        int cols=arr1[0].length;
        int[][] final_arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                final_arr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return final_arr;
    }
    public static void main(String[]args){
        //Matrix Declaration
        int[][] arr1={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] arr2={{5,6,7,8},{5,6,7,8},{5,6,7,8},{5,6,7,8}};
        int[][] final_arr=helper(arr1,arr2);

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(final_arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
