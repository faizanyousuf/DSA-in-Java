public class Negatives{
    public static void main(String[] args){
        int[] arr = {4,55,2, -42,33,-2452,-889};

        for(int i = 0; i<arr.length;i++){
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }
    }
}