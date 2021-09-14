/*
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
*/

/ { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        sb.append(S);
        sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
             if(sb.charAt(i)=='.')
            {
                temp.reverse();
                res.append(temp.toString());
                res.append(sb.charAt(i));
                temp.setLength(0);
                continue;
            }
            temp.append(sb.charAt(i));
           
        }
        res.append(temp.reverse());
        return res.toString();
    }
}