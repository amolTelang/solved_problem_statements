/*
Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
*/
public class Main
{
    static void segregateElements(int arr[])
    {   int key,j;
        for(int i=1;i<arr.length;i++)
        {
             key=arr[i];
            
            if(key<0)
            {
                continue;
            }
             j=i-1;
            while(j>=0&&arr[j]<0)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");
        }
    }
    
	public static void main(String[] args) {
		int[] array =new int[]{1, -1, 3, 2, -7, -5, 11, 6};
	    segregateElements(array);
	}
}
