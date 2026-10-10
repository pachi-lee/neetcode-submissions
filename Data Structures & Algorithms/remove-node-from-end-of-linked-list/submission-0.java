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
        ListNode Dummy = new ListNode(0,head); 
        ListNode l = Dummy.next; 
        ListNode cur = Dummy; 

         //find the length of the list 
         int index = 0; 
         while (l != null){
            index++;
            l = l.next; 
         }

         for (int i = 0; i < index - n; i++){
            cur = cur.next; 
         }
        
        cur.next = cur.next.next; 
        return Dummy.next; 
    }
}
