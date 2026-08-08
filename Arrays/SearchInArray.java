import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args){

        int x;
        int n;
        int index = -1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter n: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter value of array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter x to search: ");
        x = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        System.out.println(index);
        sc.close();
    }
}
