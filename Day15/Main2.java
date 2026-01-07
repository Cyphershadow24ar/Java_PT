package Day15;
import java.util.*;


public class Main2 {
    public static void main(String[] args){
        
        // Selection sort

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the series which need to sorted:");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // selection sort logic
        int min;
        for(int i=0 ; i<arr.length-1; i++){
            min =i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            if(i != min)
                swap(arr, i, min);
        }
        System.out.println("Selection sort");
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
