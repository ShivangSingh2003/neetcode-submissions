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
    int globalMax = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int sum = maxSum(root);
        return globalMax;
    }

    public int maxSum(TreeNode root){
        if(root == null)
            return 0;
        int leftSum = maxSum(root.left);
        int rightSum = maxSum(root.right);
        int nodeVal = root.val;
        int returnVal = Math.max(nodeVal, Math.max(leftSum+nodeVal,rightSum+nodeVal));
        int nodeGlobalMax = Math.max(returnVal, leftSum+rightSum+nodeVal);
        globalMax = Math.max(globalMax, nodeGlobalMax);

        return returnVal;
    }
}
