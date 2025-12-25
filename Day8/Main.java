package Day8;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        /*
        1D - [] size of num / col

        2D - [] [] No. rows and No. col

        Multi. D - [] [] [] No. of tables, No. of rows in each table , No. cols in each row.

         */

        // int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };  2D array
         
        /*
        System.err.println("Give row dim: ");
        int r = sc.nextInt();
        System.err.println("Give col dim: ");
        int c = sc.nextInt();

        
        int [][] a = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++)
                a[i][j] = sc.nextInt();
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.err.println();
        } //matrix printing
          */

        // Read two matrixs of the same dimension and add both the matrix and print the result.
        System.out.println("Enter rows and columns dimensions: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Addition and Printing result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        /*
        leetcode Question no. 1 : 2-Sums

        MY Approach : 

class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       for(int i = 1 ; i < nums.length; i++){
        for(int j = 0 ; j <  nums.length - i; j++){
            if(nums[j] + nums[j+i] == target)
            {
                return new int[]{j,j + i};
            }
        }
       }
    return new int[]{};
    }
}

SIR Approach : 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
        
    }
}
         */

        /*
        leetcode Question no. 1572:

        class Solution {
    public int diagonalSum(int[][] mat) {
        int d1= 0, d2 =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n ;j++){
                if( i== j)
                    d1 += a[i][j];
            }
        }
        int temp = n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j == temp){
                    d2 += a[i][j];
                    temp--;
                    break;
                }
            }
        }
        System.out.println(d1 + " " + d2);

        d1= a[i][i];
        d2 =a[i][n-1-i];
    }
}


class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            // Add elements from primary diagonal.
            ans += mat[i][i];
            // Add elements from secondary diagonal.
            ans += mat[n - 1 - i][i];
        }
        // If n is odd, subtract the middle element as its added twice.
        if (n % 2 != 0) {
            ans -= mat[n / 2][n / 2];
        }

        return ans;
    }
}
         */
    }
}   
