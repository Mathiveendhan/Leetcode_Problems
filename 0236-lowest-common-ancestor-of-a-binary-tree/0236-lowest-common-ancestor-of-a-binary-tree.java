/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean dfs(ArrayList<TreeNode> arr, TreeNode root, TreeNode p) {
        if (root == null) {
            return false;
        }
        arr.add(root);
        if (root.val == p.val) {
            return true;
        }
        if (dfs(arr, root.left, p)) {
            return true;
        }
        if (dfs(arr, root.right, p)) {
            return true;
        }
        arr.remove(arr.size() - 1); 
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr1 = new ArrayList<>();
        ArrayList<TreeNode> arr2 = new ArrayList<>();
        dfs(arr1, root, p);
        dfs(arr2, root, q);
        int len = Math.min(arr1.size(), arr2.size());
        TreeNode lastCommon = root;
        for (int i = 0; i < len; i++) {
            if (arr1.get(i).val != arr2.get(i).val) {
                return lastCommon;
            }
            lastCommon = arr1.get(i);
        }
        return lastCommon;
    }
}

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     public static void dfs(ArrayList<TreeNode> arr,TreeNode root,TreeNode p){
//         if(root==null){
//             return;
//         }
//         arr.add(root);
//         if(root.val==p.val){
//             return;
//         }
//         dfs(arr,root.left,p);
//         arr.remove(arr.size()-1);
//         dfs(arr,root.right,p);
//         //arr.remove(arr.size()-1);

//     }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         ArrayList<TreeNode> arr1=new ArrayList<>();
//         ArrayList<TreeNode> arr2=new ArrayList<>();
//         dfs(arr1,root,p);
//         dfs(arr2,root,q);
//         int len=Math.min(arr1.size(),arr2.size());

//         // if(arr1.get(len-1).val==arr2.get(len-1).val){
//         //     return arr2.get(len-1);
//         // }
//         System.out.print(len);

//         for(int i=0;i<len;i++){
//             if((arr1.get(i)).val==(arr2.get(i)).val){
//                 return arr1.get(i);
//             }
//         }
//         return arr1.get(len-1);
//     }
// }