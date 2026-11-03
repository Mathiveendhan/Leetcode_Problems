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
    static void Inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
       ArrayList<Integer> arr=new ArrayList<>();
       Inorder(root,arr);
       return arr.get(k-1); 
    }
}