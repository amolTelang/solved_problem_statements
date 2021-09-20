/******************************************************************************

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

*******************************************************************************/
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle))
            return 0;
        int n = haystack.length();
        int m = needle.length();
        int i,j;
        for( i=0;i<=n-m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                        break;

            }
                            if(j==needle.length())
                            return i;
        }
        return -1;
    }
}
