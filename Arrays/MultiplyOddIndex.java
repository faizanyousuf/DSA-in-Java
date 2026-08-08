import java.util.Scanner;

public class MultiplyOddIndex{
    public static void main(String[] args) {
        System.out.println("enter N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                arr[i] += 10;
            }else{
                arr[i] *=2;
            }
        }

        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}