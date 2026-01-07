import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Binary Search Algorithm

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Array declaration
        int[] arr = new int[n];

        // Input sorted array elements
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Key to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        /* Iteravtive method 
        int l = 0, h = n - 1;
        boolean found = false;

        while (l <= h) {
            int m = (l + h) / 2;

            if (arr[m] == key) {
                System.out.println("Yes, found at index " + m);
                found = true;
                break;
            } else if (arr[m] < key) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
            */

        boolean result = binarySearch(arr, 0, n - 1, key);

        if (result)
            System.out.println("✅ Element found in the array.");
        else
            System.out.println("❌ Element not found in the array.");

        sc.close();
    }

    /* Recursive method */

    public static boolean binarySearch(int[] arr, int low, int high, int key){
        // ✅ Base case (element not found)
        if (low > high)
            return false;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return true;
        else if (arr[mid] < key)
            return binarySearch(arr, mid + 1, high, key);
        else
            return binarySearch(arr, low, mid - 1, key);
    }
}
