package Day15;
import java.util.*;

public class Main3 {
    public static void main(String[] args){
            // Insertion sort

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of array to be sorted: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.err.println(Arrays.toString(arr));

        // insertion sort logic
        int temp, j;
        for(int i =1; i<arr.length; i++){
            temp = arr[i];
            j = i-1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println("Insertion sort");
        System.err.println(Arrays.toString(arr));
    
    }
    
}
