/*
IMPORTANT : INFO about MCQ and Coding test.

Quiz - assessment : online on the portal 

20 MCQ questions and 20 minutes

and Saturday - Coding test -> Online on the portal
1 - easy
2 - medium 
1 - hard

20 min each * 4 = 80 min but will have 10 min extra => Grand total = 90 min

BUT after 2 exams We will get 5 questions in Coding test.
Syllabus for mid-sem : Covered till this Friday ! 

type of question paper style : Company setup questions, interview style questions, eg : Congizent, accenture, etc.
Go for pyq on online sites.

Syllabus : till functions and recursion.

 */

public class Main{
    public static void main(String[] args){
        /*
        Leetcode : 58. Length of Last Word
            
        MY approach : 

        class Solution {
            public int lengthOfLastWord(String s) {
                int n = s.length();
                int i = n-1;
                while(i >= 0 && s.charAt(i) == ' ') {  
                    i--;
                }
                int len = 0;
                while(i >= 0 && s.charAt(i) != ' ') {  
                    len++;
                    i--;
                }
            return len;
        }
    }


        Sir approach : 

        public int lengthOf(Lastword(String s){
            int len =0;

            for(int i = s.length() - 1; i >= 0; i--){
                if(s.charAt(i) != ' ')
                    len++;
                else
                    if(len > 0)
                    return len;
            }
            return  len;
        }

        */

        /*

        Leetcode Question : 14. Longest Common Prefix

        Sradha Approach : 
        class Solution {
            public String longestCommonPrefix(String[] strs) {
                if (strs == null || strs.length == 0)
                    return "";

                for (int i = 0; i < strs[0].length(); i++) {
                    char ch = strs[0].charAt(i);

                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                        return strs[0].substring(0, i);
                    }
                }
            }
            return strs[0];
        }
    }

    Time Complexity : O(n^2)

    Sir approach : 

    1. Sort then store the small string 
    2. then check for other strings for match.
    3. Look at 1st and last word and then compare it 

    class Solution {
        public String longestCommonPrefix(String[] strs){
            StringBuilder res = new StringBuilder();

            Arrays.sort(strs);

            char[] first =strs[0].toCharArray();
            char[] last = strs[strs.length-1].toCharArray();

            for(int i=0; i<first.length; i++){
                if(first[i] != last[i])
                    break;
                res.append(first[i]);
            }
            return res.tostring();
        }
        */

        /*
        Leetcode : 459 Repeated Substring Pattern

        Sradha approach : 

        class Solution {
            public boolean repeatedSubstringPattern(String s) {
                int n = s.length();
                int[] lps = new int[n];
                int len = 0;

                for (int i = 1; i < n; ) {
                    if (s.charAt(i) == s.charAt(len)) {
                        lps[i++] = ++len;
                    } else if (len > 0) {
                        len = lps[len - 1];
                    } else {
                        i++;
                    }
                }   

                int longestPrefixSuffix = lps[n - 1];
                return longestPrefixSuffix > 0 && n % (n - longestPrefixSuffix) == 0;
            }
        }


        Sir approach :

        class Solution {
            public boolean repeatedSubstringPattern(String s){
                for(int i=0; i<s.length()/2 ; i++){
                    String substring = s.substring(0, i+1);

                    
                }
            }
         */
    }
}

