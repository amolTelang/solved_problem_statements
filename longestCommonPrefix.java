/*
Given a array of N strings, find the longest common prefix among all strings present in the array.
*/

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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        String result="";
         result=arr[0];
        for(int i=0;i<arr.length;i++)
        {  
            result=longestCommonPrefixCalculate(result,arr[i]);
        }
       if(result=="")
       {
           return "-1";
       }
       
       return result;
        
        
    }
    //returns common prefix between 2 strings
    String longestCommonPrefixCalculate(String str1,String str2)
    {
        String result="";
        for(int i=0, j=0;i<str1.length() && j<str2.length();i++,j++)
        {
            if(str1.charAt(i)!=str2.charAt(j))
                break;
            result+=str1.charAt(i);
        }
        return result;
    }
}