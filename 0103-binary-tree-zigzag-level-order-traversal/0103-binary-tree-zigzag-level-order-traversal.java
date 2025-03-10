import java.util.*;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode r = q.poll();
                if (r.left != null) {
                    q.add(r.left);
                }
                if (r.right != null) {
                    q.add(r.right);
                }
                arr.add(r.val);
            }
            if (level % 2 != 0) {
                Collections.reverse(arr);
            }
            ans.add(arr);
            level++;
        }

        return ans;
    }
}
