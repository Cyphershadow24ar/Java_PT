import java.util.*;
public class Main {
    public static void main(String[] args){
        /*
            leetcode : 238 - Product of Array Except Self

            approach 1 : Optimal Solution (Archita Ma'am)
            
            time complexity : O(n)
            space complexity : O(1)

            class Solution {
                public int[] productExceptSelf(int[] nums) {
                    int n=nums.length;
                    int[] ans=new int[n];
                    int right=1;
                     ans[0] = 1;
                    for(int i=1;i<n;i++){
                        ans[i]=ans[i-1]*nums[i-1];
                    }

                    for(int i=n-1;i>=0;i--){
                        ans[i]=ans[i]*right;
                        right*=nums[i];
                    }
        
                    return ans;
                }
            }

            approach 2 : Sir

            time complexity : O(n)
            space complexity : O(1)

            class Solution {
                public int[] productExceptSelf(int[] nums) {
                    int[] l = new int[nums.length];
                    int[] r = new int[nums.length];
                    int[] ans = new int[nums.length];
                    l[0] = 1;
                    for(int i = 1; i < nums.length; i++) {
                        l[i] = l[i - 1] * nums[i - 1];
                    }
                    r[nums.length - 1] = 1;
                    for(int i = nums.length - 2; i >= 0; i--) {
                        r[i] = r[i + 1] * nums[i + 1];
                    }
                    for(int i = 0; i < nums.length; i++) {
                        ans[i] = l[i] * r[i];
                    }
                    return ans;
                }
            }

         */

            /*  String - in java string is wrapper class

            int a;
            float b;
            char c;
            double d;
            */

            Scanner sc = new Scanner(System.in);

            String name = "Ram";
            System.out.println(name);

            String name2 = new String("Aniket");
            System.out.println(name2);

            // Capcity - is not with string but it's with StringBuilder and String Buffer.
            // System.out.println(name2.capacity());

            String name3 = "Raj";
            System.err.println(name3.charAt(2)); // printing that particular position of character

            // String is immutable in java, but you can make them mutable using StringBuilder and StringBuffer or convert it into array.

            StringBuffer name4 = new StringBuffer("Sragun");
            System.err.println(name4);
            // Using string buffer and I can avoid relocation of string.
            System.err.println(name4.length());
            System.err.println(name4.capacity()); // it will have 16 bites of buffer is left after the string initialization.

            name4.append(" Aniket");
            System.err.println(name4);
            System.err.println(name4.length());
            System.err.println(name4.capacity());

            name4.delete(5, 10); // it delete the characters from 5 to 10
            System.err.println(name4);
            System.err.println(name4.length());
            System.err.println(name4.capacity());

            /*
                leetcode :58

                
             */


    }
}

