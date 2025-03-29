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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        if(head == null)
        {
            return head;
        }
       ListNode currt = head;
       int sum = 0;
       while(currt.val != 0)
       {
        sum += currt.val;
        currt =currt.next;
       }
       head.val = sum;
       head.next = mergeNodes(currt);
       return head;
        
    }
}