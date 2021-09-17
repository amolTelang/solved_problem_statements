/******************************************************************************

Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

*******************************************************************************/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //merge the sorted list
        
        ListNode head= new ListNode(0) ;
        ListNode tail=head;
            while(true)
            {
                    if(l1==null)
                    {   tail.next=l2;
                        break;
                    }
                    if(l2==null)
                    {   tail.next=l1;
                        break;
                    }
                    if(l1.val<=l2.val)
                    {
                       tail.next=l1;
                        l1=l1.next;
                    }
                    else
                    {
                        tail.next=l2;
                        l2=l2.next;
                        
                    }
                    tail=tail.next;
                    
            }
        return head.next;
    }
}
