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
    public void reorderList(ListNode head) {
        
        ListNode dummy = new ListNode();
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode left = head;
        ListNode right = reverse(slow);
        if(prev != right)
            prev.next = right;
        ListNode mid = right;
        dummy.next = left;
        left = left.next;
        ListNode curr = dummy.next;
        while(right != null && left != mid && left != null){
            curr.next = right;
            curr = curr.next;
            right = right.next;
            curr.next = left;
            curr = curr.next;
            left = left.next;
        }
        while(right != null && curr != right){
            curr.next = right;
            curr = curr.next;
            right = right.next;
        }
    }

    public ListNode reverse(ListNode head){
        
        if(head == null)
            return null;
        ListNode newHead = head;

        if(head.next != null){
            newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
        }
        return newHead;
    }
}
