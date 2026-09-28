/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public int kthSmallest(TreeNode root, int k) {
        int counter = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        do{
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            counter++;
            System.out.print(counter);
            if(counter == k)
                return curr.val;
            curr = curr.right;
        }while(curr != null || !stack.isEmpty());
        return -1;
    }

    
}
