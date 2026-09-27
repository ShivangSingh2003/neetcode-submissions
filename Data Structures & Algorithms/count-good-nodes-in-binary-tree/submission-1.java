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
    public int goodNodes(TreeNode root) {
        return count(root, root.val);
    }
    public int count(TreeNode node, int max){
        if(node == null)
            return 0;
        if(node.val >= max){
            int left = count(node.left, node.val);
            int right = count(node.right, node.val);
            return left+right+1;
        }
        else{
            int left = count(node.left, max);
            int right = count(node.right, max);
            return left+right;
        }
    }
}
