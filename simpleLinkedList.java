/******************************************************************************

linked list in java
*******************************************************************************/
import java.util.*;
public class Main
{
    
  public static void main (String[]args)
  { 
      int choice=0;
      
    LinkedList<Integer>ll=new LinkedList<Integer>();
   
    
    while(true)
    {   
         System.out.println("enter choicem 1.Insert 2.Delete 3.Display 4.Exit");
         Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("enter the element to be addded");
            ll.add(sc.nextInt());
            break;
            case 2:System.out.println("Enter the position of the element to be deleted");
            ll.remove(sc.nextInt());
            break;
            case 3:System.out.println(ll);
            break;
            case 4:System.exit(0);
            break;
            default:System.exit(0);
        }
    }
  }
}
