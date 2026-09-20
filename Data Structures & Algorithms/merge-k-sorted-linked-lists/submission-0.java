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

        if(lists.length == 0) return null;
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < lists.length; i++){
            ListNode ptr = lists[i];
            while(ptr != null){
                nums.add(ptr.val);
                ptr = ptr.next;
            }
        }
        if(nums.size() == 0) return null;
        Collections.sort(nums);
        ListNode head = new ListNode(nums.get(0));
        ListNode temp = head;

        for(int num : nums){
            ListNode node = new ListNode(num);
            head.next = node;
            head = head.next;
        }
        head.next = null;
        return temp.next;
    }
}
