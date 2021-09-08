//java program to Find duplicates within a range `k` in an array
import java.util.*;

public class Main
{
    
   static boolean duplicateInAGivenRange(int arr[],int k)
    {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {   
            //if map contains the element
            if(mp.containsKey(arr[i]))
            {
                //check if within given range 
                if((i - mp.get(arr[i]))<=k)
                {
                    return true;
                }
            }
            else{
                mp.put(arr[i],i);
            }
        }
        return false;
    }
	public static void main(String[] args) {
	int[] array =new int[]{2,3,4,5,5,6};
	int k=3;
	
	if(duplicateInAGivenRange(array,k))
	{
	    System.out.println("Duplicates Present");
	}
	else{
	    System.out.println("Duplicates not found");
	}
	}
}