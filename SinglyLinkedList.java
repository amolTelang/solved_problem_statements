/******************************************************************************

Linked List in java with add at front, add at the end, deleted an element,delete node from a specific position,display list methods

*******************************************************************************/
import java.util.*;
public class Main
{   //head of the list
    Node head;
    
    //class node
    static class Node{
        int data;
        Node next;
        //constructor
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    //insert at the front of the linked list
    static  Main insertFront(Main list,int data)
    {
        Node newNode=new Node(data);
       
        if(list.head==null)
            list.head=newNode;
        else
        {
            Node temp=list.head;
            list.head=newNode;
            newNode.next=temp;
        }
        return list;
    }
    //insert element at the end of the list
    static Main insertEnd(Main list,int data)
    {
       Node newNode=new Node(data);
       //check if list is empty
       if(list.head==null)
       {
                list.head=newNode;
       }
       else
       {
           Node currNode=list.head;
           while(currNode.next!=null)
           {
               currNode=currNode.next;
           }
           currNode.next=newNode;
       }
       return list;
    }
    
    //delete element from the linked list
    static Main deleteEle(Main list,int element)
    {
        //if list is empty
        if(list.head==null)
        {
            System.out.println("List is empty cannot delete");
            return list;
        }
        
        //if element to be deleted in head
        Node currNode=list.head;
        Node prev=null;
        if(currNode.data==element)
        {
            currNode=currNode.next;
            list.head=currNode;
            System.out.println("Element deleted");
            return list;
        }
        //if element to be delete is in middle
        while(currNode!=null && currNode.data!=element)
        {
            prev=currNode;
            currNode=currNode.next;
        }
        
        if(currNode!=null)
        {
            prev.next=currNode.next;
            return list;
        
        }
        //if element to be deleted is not present in the list
        if(currNode==null)
        {
            System.out.println("Element not found");
        }
        return list;
    }
    
    //delete from a position
    static Main deletePos(Main list,int pos)
    {   int counter=0;
        Node currNode=list.head,prev=null;
        //if list is empty
         if(list.head==null)
        {
            System.out.println("List is empty cannot delete");
            return list;
        }
        //head to be deleted
        if(pos==0)
        {
            list.head=currNode.next;
            System.out.println("Node from the position if deleted");
            return list;
        }
        //other pos to be deleted
        while(currNode!=null&&counter!=pos)
        {   prev=currNode;
            currNode=currNode.next;
            counter++;
        }
        if(currNode!=null)
        {
            prev.next=currNode.next;
            return list;
        }
        //pos not found
        if(currNode==null)
        {
            System.out.println("Position not present");
        }
        return list;
        
    }
    
    //display the contents of the list
    static void displayList(Main list)
    {
        //if llist is empty
        if(list.head==null)
            System.out.println("List is empty please insert elements");
        else
        {   //iterate to the last node of the list
            Node currNode=list.head;
            while(currNode!=null)
            {
                System.out.println(""+currNode.data+"");
                currNode=currNode.next;
            }
        }
    }
    //main method
	public static void main(String[] args) {
	    Main linkedList=new Main();
	    int choice=0;
	    int data;
	    Scanner sc=new Scanner(System.in);
	    //menu of the program
            while(true)
            {
                System.out.println("Enter you choice");
                System.out.println("1.Add to the front 2.Add to the end 3.delete element from the list 4.delete position from the list 5.displayList  6.exit ");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:System.out.println("Enter the element you want to insert");
                          data=sc.nextInt();
                          linkedList=insertFront(linkedList,data);
                          break;
                    case 2:System.out.println("Enter the element you want to insert");
                          data=sc.nextInt();
                          linkedList=insertEnd(linkedList,data);
                          break;
                    case 3:System.out.println("Enter the element you want to delete");
                          data=sc.nextInt();
                          linkedList=deleteEle(linkedList,data);
                          break;
                    case 4:System.out.println("Enter the position you want to delete");
                          data=sc.nextInt();
                          linkedList=deletePos(linkedList,data);
                          break;
                    case 5:displayList(linkedList);
                            break;
                    case 6:System.exit(0);
                            break;
                    default:System.out.println("INVALID CHOICE!!!!");
                }
            }
	}
}
