/******************************************************************************

Given the head of a singly linked list, reverse the list, and return the reversed list.

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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode currentNode,nextNode,prevNode;
        prevNode=null;
        currentNode=head;
        nextNode=null;
        while(currentNode!=null)
        {   nextNode=currentNode.next;
            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=nextNode;
            
            
        }
        
        return prevNode;
    }
}
