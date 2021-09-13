/******************************************************************************

Given a string and an integer n the task is to split the string into n segment and print the max segment value


*******************************************************************************/
import java.util.*;
public class Main
{
    
  static int displayMaxSegmentValue (String str, int n)
  {
    int windowSize = str.length()-n+1;
    char[] tempString = new char[windowSize];
    int maxValue = Integer.MIN_VALUE;
    int maxInWindow = 0;
    int ctr=0;
    //traverse the string
    for (int i = 0; i < str.length (); i++)
    {
	    //store the elements into a temp character array
	    tempString[ctr] = str.charAt(i);
	
    	//when window is maxed out
	    if (i >= windowSize-1)
	     {
	        //get the max in window
	         maxInWindow = Integer.parseInt(new String(tempString));
	         maxValue = Math.max (maxValue, maxInWindow);
	    
	        //shift all the elements into previos position
	        for (int j = 1; j < tempString.length; j++)
	        {
		        tempString[j - 1] = tempString[j];
	         }
	      
	         ctr=ctr-1;
	  }
	    ctr++;
      }
    return maxValue;
  }


  public static void main (String[]args)
  {
    int n;
    String str;
    System.out.print ("enter the String");
    Scanner sc = new Scanner (System.in);
    str = sc.nextLine ();
    System.out.print ("enter the no");
    n = sc.nextInt ();
    System.out.println (displayMaxSegmentValue (str, n));
  }
}
