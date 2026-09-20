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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode kNode = head;
        int c = 0;
        while(c<k-1){
            if(kNode == null)
                return head;
            kNode = kNode.next;
            c++;
        }
        if(kNode == null)
                return head;
        ListNode kNext = kNode.next;
        kNode.next = null;
        ListNode l1 = reverseList(head);
        ListNode l2 = reverseKGroup(kNext, k);

        ListNode curr = l1;
        while(curr.next != null)
            curr = curr.next;
        curr.next = l2;
        return l1;
    }

    public ListNode reverseList(ListNode head){
        if(head == null)
            return head;
        
        ListNode newHead = head;

        if(head.next != null){
            newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
        }

        return newHead;
    }
}
