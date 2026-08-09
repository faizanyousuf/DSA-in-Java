public class TwoSum{
    public static void main(String[] args){
        int [] arr = {10,2,5,-1,35,29,9};
        int[] index = new int[2];
        int target = 4;
         int n = arr.length;
        for(int i = 0; i < n;i++){
            for(int j = i+1; j < n; j++){
                 if(arr[i] + arr[j] == target){
                     index[0] = i;
                     index[1] = j;
                     break;
                 }
            }
        }
         System.out.printf("%d , %d",index[0],index[1]);
    }
}