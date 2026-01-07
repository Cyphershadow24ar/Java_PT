package Day15;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Sybllabus till - Sorting and previous topics
        
        // Bubble sort

        System.err.println();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the series which need to sorted:");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // bubblesort logic 
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    /*int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;*/
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Bubble sort");
        
        /*
        Sir logic for bubble sort

        for(int i=0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
            
         */

    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }
}
