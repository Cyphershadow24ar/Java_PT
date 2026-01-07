package Day15;
import java.util.*;

public class Main4 {

    static int[] o; // original array
    static int[] s; // temporary array

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        o = new int[n];
        s = new int[n];

        System.out.println("Enter the elements of array to be sorted: ");
        for (int i = 0; i < n; i++) {
            o[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: " + Arrays.toString(o));

        // Merge sort logic
        mergeSort(0, n - 1);

        System.out.println("After Sorting:  " + Arrays.toString(o));
    }

    public static void mergeSort(int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(l, mid);
            mergeSort(mid + 1, h);
            merge(l, mid, h);
        }
    }

    public static void merge(int low, int mid, int high) {

        int l1 = low;
        int l2 = mid + 1;
        int i = low;

        // Merge two sorted halves
        while (l1 <= mid && l2 <= high) {
            if (o[l1] <= o[l2]) {
                s[i++] = o[l1++];
            } else {
                s[i++] = o[l2++];
            }
        }

        // Copy remaining elements
        while (l1 <= mid) {
            s[i++] = o[l1++];
        }

        while (l2 <= high) {
            s[i++] = o[l2++];
        }

        // Copy back to original array
        for (int k = low; k <= high; k++) {
            o[k] = s[k];
        }
    }
}
