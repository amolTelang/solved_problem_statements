/******************************************************************************

Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X. 

*******************************************************************************/
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {   //if only one element is present
        if(a.length==1)
                return a[0];
         
        //hashmap to store the frequency of each element
        Map<Integer,Integer>mp=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(mp.containsKey(a[i]))
                mp.put(a[i],mp.get(a[i])+1);
            else
                mp.put(a[i],1);
        }
         for (Map.Entry<Integer,Integer> entry : mp.entrySet())
         {
             if(entry.getValue() > a.length/2)
                    return entry.getKey();
         }
         return -1;
    }
}