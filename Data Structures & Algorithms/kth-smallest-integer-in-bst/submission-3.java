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
        List<Integer> vals = inOrder(root);
        return vals.get(k-1);
    }

    public List<Integer> inOrder(TreeNode node){
        if(node == null)
            return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        List<Integer> left = inOrder(node.left);
        List<Integer> right = inOrder(node.right);
        ans.addAll(left);
        ans.add(node.val);
        ans.addAll(right);
        return ans;
    }
}
