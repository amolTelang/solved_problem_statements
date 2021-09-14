/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
*/
class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.length()==0)
                return num2;
        if(num2.length()==0)
                return num1;
        if(num2.length()==0 && num1.length()==0)
                return "";
        
        int carry=0;
        int value=0;
        StringBuilder res=new StringBuilder();
            
            int l1=num1.length()-1;
            int l2=num2.length()-1;
            while(l1>=0||l2>=0)
            {
                int n1=l1>=0? num1.charAt(l1)-'0':0;
                int n2=l2>=0? num2.charAt(l2)-'0':0;
                value=(n1+n2+carry)%10;
                carry=(n1+n2+carry)/10;
                res.append(value);
                l1--;
                l2--;
            }
        if(carry!=0)
        {
            res.append(carry);
        }
        return res.reverse().toString();
            
            
    }
}