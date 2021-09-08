//java program to Count distinct absolute values in a sorted array
import java.util.*;

public class Main
{
    
   static int countDistinctAbsoluteValues(int arr[])
    {   int count=0;
        Map<Integer,Integer>mp=new HashMap<>();
        //traversing the array
        for(int i=0;i<arr.length;i++)
        {   //if already present inside the map
            if(mp.containsKey(Math.abs(arr[i])))
            {
                mp.put(Math.abs(arr[i]),mp.get(Math.abs(arr[i]))+1);
            }
            else
            {   //if new element
                mp.put(Math.abs(arr[i]),1);
                count++;
            }
        }
        // for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        // {   
             
            
        // }
        return count;
    }
	public static void main(String[] args) {
     int[] array =new int[]{-1, -1, -1, -1 };
	System.out.println(countDistinctAbsoluteValues(array));
	}
}