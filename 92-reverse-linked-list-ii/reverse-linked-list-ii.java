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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next =head;

          ListNode curtpre = dummy;
          ListNode curtNode = head;

          for(int i =0; i<left -1;i++)
          {
            curtpre = curtpre.next;
            curtNode = curtNode.next;

          }

          ListNode BhargavNode = curtNode ;
           
           ListNode preeNode = null;

           for(int i = 0 ; i<=right- left ; i++)
           {
            ListNode nodenext = curtNode.next;
            curtNode.next = preeNode;
            preeNode = curtNode ;
             curtNode = nodenext;
           }

           curtpre.next = preeNode;
           BhargavNode.next  = curtNode;


           return dummy.next;




    }
}