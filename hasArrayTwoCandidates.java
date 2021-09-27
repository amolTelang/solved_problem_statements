/******************************************************************************

Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X. 

*******************************************************************************/
// { Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().hasArrayTwoCandidates(arr, n, x);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
       
     Arrays.sort(arr);
     int left=0;
     int right=n-1;
     int sum=0;
     while(right>left)
     {  sum=arr[left]+arr[right];
         if(sum==x)
            return true;
         if(sum>x)
            right--;
        else
            left++;
            
     }
     return false;
     }
}