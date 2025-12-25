// Array
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
        In Java, an array is a data structure used to store a fixed-size, sequential collection of elements of the same data type. It can be thought of as a single variable with multiple storage locations (elements), each accessed by an index number. 

        Array is a collection of similar type of data.

        array data will be created in stack and the data will be stored in heap.
        in java We have refernce NO address.
        
        Synatx
        datatype[] ref_var_name = {v1, v2, v3,....};
        */

        int[] arr = {10,20,30,40,50};

        System.out.println(arr.length); // length is a property of array   
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        for(int i=0; i<n; i++)
            System.out.print(a[i]+ " ");

        // Memory wasteage & Data missing should never be done.    
        /*
        Even if We use 1 or 2 loops TC will remian same.
         
       

        // Take a input from user and print only the odd index position values of the array.

        System.out.println();

        System.out.print("Enter the size of array: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        for(int i=0; i<m ; i++)
            b[i] = sc.nextInt();

        for(int i=1; i<m ; i+=2)
            System.out.print(b[i]+ " ");
        */

        /*  Take a array input and only print the sum of all the possible square values in the array.
        ex - m =4
             b = [9,4,21,32]
             Sum = 9 + 4 = 13
             output : 13 ( because 9 is a square of 3 and 4 is a square of 2 and So ONLY add the Perfect square values)

        

        System.out.println();
        System.out.print("Enter the size of array: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        for(int i=0; i<m ; i++)
            b[i] = sc.nextInt();

        int Sum =0;
        for(int i=0; i<m ; i++){
            int sq = (int)Math.sqrt(b[i]);
            if(sq*sq == b[i]){
                Sum = Sum + b[i]; 
            }
        }
        System.out.println(Sum);
        */
    
        // In placements the companies will ask to write the code using minor lib's will only be used when required and major lib's will be blocked and we won't be able to use it, So don't rely on lib's learn logic.
        
        // leetcode - 26, 
        // instacks portal for questions
        sc.close();
        
    }
    
}
