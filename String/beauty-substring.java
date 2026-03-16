/*The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.

Example 1:
Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
Substrings with beauty > 0:
"aab"   → a=2,b=1     → 2-1 = 1
"aabc"  → a=2,b=1,c=1 → 2-1 = 1
"aabcb" → a=2,b=2,c=1 → 2-1 = 1
"abcb"  → a=1,b=2,c=1 → 2-1 = 1
"bcb"   → b=2,c=1     → 2-1 = 1
Total = 5 ✅*/

import java.util.*;
import java.io.*;

public class beautySubstring {

    // =============================================
    // WRITE YOUR LOGIC HERE
    // =============================================
    public static int beautySum(String s) {
        int ans=0;
        
        for(int i=0;i<s.length();i++)
        {
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++)
            {
                char c = s.charAt(j);
                freq[c - 'a']++;
                
                int min = Integer.MAX_VALUE;
                int max= Integer.MIN_VALUE;
            
            for(int k=0;k<26;k++)
            {
                if(freq[k]>0)
                {
                min=Math.min(freq[k],min);
                max=Math.max(freq[k],max);
                }
            }
             ans=ans+(max-min);
        }
        }
        return ans; 
    }
