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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pval = p.val;
        int qval = q.val;
        int rootval = root.val;
        if((pval < rootval && qval > rootval) || (pval > rootval && qval < rootval))
            return root;
        if(pval < rootval && qval < rootval)
            return lowestCommonAncestor(root.left, p, q);
        if(pval > rootval && qval > rootval)
            return lowestCommonAncestor(root.right, p, q);
        if(pval == rootval || qval == rootval)
            return root;
        return null;
    }
}
