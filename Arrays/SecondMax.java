import java.util.Arrays;
public class SecondMax{
    public static void main(String[] args){
        
        int[] arr ={2,9,40,8,30 ,42,40,};

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
             if(arr[i] > max){
                max = arr[i];
             }
        }
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                continue;
            }else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);

        Arrays.sort(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
        int index = arr.length-2;        
        int maxElement = arr[arr.length-1];
        do{
            index--;
        }while(arr[index] == maxElement);

        System.out.println(arr[index]);
    }
}
