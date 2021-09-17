/******************************************************************************

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

*******************************************************************************/
import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.fill(res,0);
        for(int i=0,j=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                res[j]=nums[i];
                j++;
            }
        }
      for(int i=0;i<nums.length;i++)
      {
          nums[i]=res[i];
      }
        
    }
}