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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fistpointer = dummy;
        ListNode secondPointer = dummy;

        for(int i =0; i<n ;i++)
        {
            secondPointer = secondPointer.next;
        }

        while(secondPointer.next != null)
        {
            fistpointer = fistpointer.next;
            secondPointer = secondPointer.next;
        }


        fistpointer.next = fistpointer.next.next;
        return dummy.next;    
        
    }
}