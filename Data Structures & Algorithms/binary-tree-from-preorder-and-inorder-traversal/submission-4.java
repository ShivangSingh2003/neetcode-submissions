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
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return build(preorder, 0, 0, inorder.length-1);
    }

    public TreeNode build(int[] preorder, int preRoot, int left, int right){
        if(left > right)
            return null;

        int inRoot = map.get(preorder[preRoot]);
        int k = inRoot-left;
        TreeNode leftSub = build(preorder, preRoot+1, left, inRoot-1);
        TreeNode rightSub = build(preorder, preRoot+k+1, inRoot+1, right);
        TreeNode root = new TreeNode(preorder[preRoot], leftSub, rightSub);
        return root;
    }
}
