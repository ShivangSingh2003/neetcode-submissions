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
        
        ListNode tail = head;
        if(tail == null) return tail;
        while(tail.next != null) tail = tail.next;

        rev(null, head);
        return tail;
    }

    public void rev(ListNode prev, ListNode curr){
        if(curr == null)
            return;
        rev(curr, curr.next);
        curr.next = prev;
    }
}
