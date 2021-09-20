/******************************************************************************

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

*******************************************************************************/
import  java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[]str1=s.toLowerCase().toCharArray();
        char[]str2=t.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2))
        {
            return true;
        }
        return false;
    }
}