/*Given a string s, find the length of the longest substring without duplicate characters. 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.*/


import java.util.*;

public class longestSubstring {

    // =============================================
    // WRITE YOUR LOGIC HERE
    // =============================================
    public static int lengthOfLongestSubstring(String s) {

        if(s == null || s.length()==0) return 0;
        int left = 0;
        int maxLength=0;
        Set<Character> set = new HashSet<>();
        for(int right=0; right<s.length(); right++)
        {
            char ch=s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
        
        maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength; // change this
    }
