/******************************************************************************

Given a string S, find the length of the longest substring without repeating characters.

*******************************************************************************/
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        int maxLength=Integer.MIN_VALUE;
        String test="";
        if(S.length()==1)
        {
            return 1; 
        }
        if(S.isEmpty())
        {
            return 0;
        }
        for(char c:S.toCharArray())
        {
            String current=String.valueOf(c);
            if(test.contains(current))
            {
                test=test.substring(test.indexOf(current)+1);
            }
            test=test+String.valueOf(c);
            maxLength=Math.max(maxLength,test.length());
        }
        return maxLength;
    }
}
