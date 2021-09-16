/******************************************************************************

Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

*******************************************************************************/
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        // code here
        int lengthPat=s.length();
	    int[] arr=new int[lengthPat];
	    int len=0;
	    int i=1;
	    arr[0]=0;
	    //loop start
	    while(i<lengthPat)
	    {
	        if(s.charAt(i)==s.charAt(len))
	        {
	            len++;
	            arr[len]=len;
	            i++;
	        }
	        else if(len!=0)
	        {
	            len=arr[len-1];
	        }
	        else
	        {
	            arr[i]=len;
	            i++;
	        }
	    }
	    return len;
    }