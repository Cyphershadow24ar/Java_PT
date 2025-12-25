package Day11;

public class Main {
    public static void main(String[] args){
        // Leetcode : 28 Find the index of the first  Occurence in a String 

        /*

        Brute Force : 

        class Solution {
    public int strStr(String haystack, String needle) {
        // haystack is big string 
        // needle is small string to sereach for the pattern in the haystack string 

         int n = haystack.length();
         int m = needle.length();

         for(int i=0; i <= n-m; i++){
            int j=0;
            while(j < m && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if( j== m){
                return i;
            }
         }

         return -1;
    }
}


        OPtimal solution : 

        class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int l = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= l - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
         */
    }
}
