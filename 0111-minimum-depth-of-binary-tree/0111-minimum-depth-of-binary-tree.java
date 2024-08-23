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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return mindepth(root);
    }

    public int mindepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefDepth = mindepth(root.left);
        int righDepth = mindepth(root.right);
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return righDepth+1;
        }
        if(root.right==null){
            return lefDepth+1;
        }
        return Math.min(lefDepth, righDepth) +1;
    }
}