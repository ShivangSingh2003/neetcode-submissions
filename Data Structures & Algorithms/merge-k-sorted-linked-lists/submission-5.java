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
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length-1);
    }

    public ListNode mergeKLists(ListNode[] lists, int left, int right){
        if(left == right)
            return lists[left];
        if(left > right)
            return null;
        int mid = left + (right - left)/2;
        ListNode l = mergeKLists(lists, left, mid);
        ListNode r = mergeKLists(lists, mid+1, right);

        return mergeTwoLists(l, r);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(curr1 != null && curr2 != null){
            curr.next = curr1.val <= curr2.val ? curr1 : curr2;
            curr = curr.next;
            if(curr == curr1) 
                curr1 = curr1.next;
            else 
                curr2 = curr2.next;
        }
        if(curr1 != null)
            curr.next = curr1;
        if(curr2 != null)
            curr.next = curr2;

        return dummy.next;
    }
}
