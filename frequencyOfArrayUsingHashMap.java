//java program to find the frequency of each element inside an array using hashmap
import java.util.*;

public class Main
{
    
   static void countFrequency(int arr[])
    {
        Map<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
         for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
	public static void main(String[] args) {
	int[] array =new int[]{4,2,2,7,8,1,2,8,10,2,2,2,2};
		countFrequency(array);
	}
}