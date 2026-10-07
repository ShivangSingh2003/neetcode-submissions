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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String str = "";
        Deque<TreeNode> q = new LinkedList<>();
        if(root != null)
            q.add(root);
        else 
            return str;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();
                if(node == null){
                    str += "#";
                    continue;
                }
                if(node.left != null)
                    q.add(node.left);
                else
                    q.add(null);
                if(node.right != null)
                    q.add(node.right);
                else
                    q.add(null);
                str += node.val + "*";
                
            }
        }
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int length = data.length();
        if(length == 0)
            return null;
        int cur = 0;
        Deque<TreeNode> q = new LinkedList<>();
        String num = "";
        while(data.charAt(cur) != '*'){
            num += data.charAt(cur);
            cur++;
        }
        cur++;
        TreeNode dummy = new TreeNode(Integer.parseInt(num));
        q.add(dummy);
        while(!q.isEmpty()){
            num = "";
            boolean nullL = false;
            boolean nullR = false;
            TreeNode root = q.remove();
            
            if(data.charAt(cur) == '#'){
                cur++;
                nullL = true;
            }
            if(!nullL){
                num = "";
                while(data.charAt(cur) != '*'){
                    num += data.charAt(cur);
                    cur++;
                }
                cur++;
                TreeNode temp = new TreeNode(Integer.parseInt(num));
                root.left = temp;
                q.add(temp);
            }
            if(data.charAt(cur) == '#'){
                cur++;
                nullR = true;
            }
            if(!nullR){
                num = "";
                while(data.charAt(cur) != '*'){
                    num += data.charAt(cur);
                    cur++;
                }
                cur++;
                TreeNode temp = new TreeNode(Integer.parseInt(num));
                root.right = temp;
                q.add(temp);
            }
            if(nullL && nullR)
                continue;
  
        }
        return dummy;
    }
}
