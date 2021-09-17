/******************************************************************************

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer>mp=new HashMap<>();
        ListNode temp=head;
        //count all the elements in the list
        while(temp!=null)
        {
            if(mp.containsKey(temp.val))
            {
                mp.put(temp.val,mp.get(temp.val)+1);
            }
            else
            {
                mp.put(temp.val,1);
            }
            temp=temp.next;
        }
         TreeMap<Integer, Integer> sorted = new TreeMap<>();
        sorted.putAll(mp);
        ListNode result=new ListNode(0);
        ListNode tail=result;
        for(Map.Entry<Integer, Integer> entry : sorted.entrySet())
        {
           
                ListNode newNode=new ListNode(entry.getKey());
                tail.next=newNode;
                tail=tail.next;
            
            
        }
        return result.next;
    }
}
