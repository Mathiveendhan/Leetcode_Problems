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
    static int ans = 0;
    static int count = 0;

    static void Inorder(TreeNode root) {
        if (root == null || count < 0)
            return;

        Inorder(root.left);
        count--;
        if (count == 0) {
            ans = root.val;
            return;
        }
        Inorder(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        Inorder(root);
        return ans;
    }
}

// class Solution {
//     static void Inorder(TreeNode root,ArrayList<Integer> arr){
//         if(root==null){
//             return;
//         }
//         Inorder(root.left,arr);
//         arr.add(root.val);
//         Inorder(root.right,arr);
//         return;
//     }
//     public int kthSmallest(TreeNode root, int k) {
//        ArrayList<Integer> arr=new ArrayList<>();
//        Inorder(root,arr);
//        return arr.get(k-1); 
//     }
// }