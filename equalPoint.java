/*
Given a string S of opening and closing brackets '(' and ')' only. The task is to find an equal point. An equal point is an index such that the number of closing brackets on right from that point must be equal to number of opening brackets before that point.

*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(str));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public long countSub(String str) {
        int len=str.length();
        int[] open=new int[len+1];
        int[] close=new int[len+1];
        int index=-1;
        open[0]=0;
        close[len]=0;
        if(str.charAt(0)=='(')
            open[1]=1;
        if(str.charAt(len-1)==')')
            close[len-1]=1;
            
        for(int i=1;i<len;i++)
        {
            if(str.charAt(i)=='(')
                open[i+1]=open[i]+1;
            else
                open[i+1]=open[i];
        }
         for(int i=len-2;i>=0;i--)
        {
            if(str.charAt(i)==')')
                close[i]=close[i+1]+1;
            else
                close[i]=close[i+1];
        }
        
        if(open[len]==0)
            return len;
        if(close[0]==0)
            return 0;
        for(int i=0;i<=len;i++)
        {
            if(open[i]==close[i])
                index=i;
        }
        return index;
    }
}