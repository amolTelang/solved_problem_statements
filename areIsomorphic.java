/******************************************************************************

Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
Note: All occurrences of every character in ‘str1’ should map to the same character in ‘str2’

*******************************************************************************/
// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends


class Solution {
public boolean areIsomorphic(String s, String t) {
Map<Character, Character> map = new HashMap<>();

    if(null == s || null == t){
        return false;
    }
    
    if(s.length() != t.length()){
        return false;
    }
    
    for(int i =0; i<s.length();i++){
        if((map.containsKey(s.charAt(i)) && t.charAt(i) != map.get(s.charAt(i)))){
            return false;
        }
        if(!map.containsKey(s.charAt(i))) {
            if(!map.values().contains(t.charAt(i))){
             map.put(s.charAt(i),t.charAt(i));
            }
            else{
                 return false;
            }
        }
    }
    return true;
}

}
