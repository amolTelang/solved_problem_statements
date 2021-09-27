/******************************************************************************

Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 

*******************************************************************************/
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
            int count=0;
            int currentSum=0;
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==0)
                        arr[i]=-1;
                currentSum+=arr[i];
                
                if(currentSum==0)
                        count++;
                if(mp.containsKey(currentSum))
                        count+=mp.get(currentSum);
                if(!mp.containsKey(currentSum))
                        mp.put(currentSum,1);
                else
                    mp.put(currentSum,mp.get(currentSum)+1);
                
                
            }
            return count;
    }
}
