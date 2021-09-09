// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob=new Solution();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}
		
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {   int count=0;
        Map<Integer,Integer>mp=new HashMap<>();
        //counting all the elements in the first array
        for(int i=0;i<a.length;i++)
        {
            if(mp.containsKey(a[i]))
            {
                mp.put(a[i],mp.get(a[i])+1);
            }
            else
            {
                mp.put(a[i],1);
            }
        }
        //counting all the elements in the second array
        for(int i=0;i<b.length;i++)
        {
            if(mp.containsKey(b[i]))
            {
                mp.put(b[i],mp.get(b[i])+1);
            }
            else
            {
                mp.put(b[i],1);
            }
        }
        //counting all the elements in the hash map
        for(Map.Entry<Integer,Integer>entry:mp.entrySet())
        {
            count++;
        }
        return count;
    }
    
}