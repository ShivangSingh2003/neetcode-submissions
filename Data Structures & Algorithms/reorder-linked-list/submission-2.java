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
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode();
        ListNode temp = head;
        int index = 0;
        while(temp != null){
            map.put(index++, temp);
            temp = temp.next;
        }

        int s = 0;
        int e = index-1;
        dummy.next = map.get(s++);
        temp = dummy.next;
        while(s <= e){
            if(s == e){
                temp.next = map.get(s);
                temp = temp.next;
                break;
            }
            temp.next = map.get(e--);
            temp = temp.next;
            temp.next = map.get(s++);
            temp = temp.next;
        }
        temp.next = null;
    }
}
