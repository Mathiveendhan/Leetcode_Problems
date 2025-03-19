/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode r = root;
        while (true) {
            if (r.val > val) {
                if (r.left != null) { 
                    r = r.left; 
                } else {
                    r.left = new TreeNode(val);
                    break;
                }
            } else {
                if (r.right != null) { 
                    r = r.right; 
                } else {
                    r.right = new TreeNode(val); 
                    break;
                }
            }
        }
        return root;
    }
}
