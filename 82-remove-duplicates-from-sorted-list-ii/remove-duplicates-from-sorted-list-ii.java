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

        ListNode dummy = new ListNode (0);
        dummy.next = head;

        ListNode prives = dummy;
        ListNode currt = head;

        while(currt != null)
        {
            if(currt.next != null && currt.val == currt.next.val)
            {
                while(currt.next != null && currt.val == currt.next.val)
                {
                    currt = currt.next;
                }

                prives.next = currt.next;
            }else{
                prives = prives.next;
            }

            currt = currt.next;
        }

        return dummy.next;
        
    }
}