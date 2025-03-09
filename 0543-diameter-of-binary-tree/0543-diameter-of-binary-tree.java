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
    public static int call(TreeNode root,int[] max){
        if(root==null){
            return 0;
        }
        int l=call(root.left,max);
        int r=call(root.right,max);
        max[0]=Math.max(max[0],r+l);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max=new int[1];
        call(root,max);
        return max[0];
    }
}