/******************************************************************************

Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.

Two strings are called K-anagrams if both of the below conditions are true.
1. Both have same number of characters.
2. Two strings can become anagram by changing at most K characters in a string

*******************************************************************************/
// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}// } Driver Code Ends


//User function template for JAVA

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        
        if(s1.length()!=s2.length())
        {
            return false;
        }
    HashMap<Character,Integer>map=new HashMap<Character,Integer>();
    for(int i=0;i<s1.length();i++)
    {
        map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
    }
    for(int i=0;i<s2.length();i++)
    {
        if(map.getOrDefault(s2.charAt(i),0)> 0)
        {
            map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
        }
    }
    int count=0;
    for(char ch:map.keySet())
    {
        count+=map.get(ch);
    }
    if(count>k)
    {
        return false;
    }
    else
    {
        return true;
    }
    
    }
}