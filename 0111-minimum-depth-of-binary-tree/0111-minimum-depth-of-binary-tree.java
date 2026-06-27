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
        if(root ==  null) return 0;
        //leaf node ek ek rahi toh
        if(root.left == null && root.right == null) return 1; 
        //only right subtree exists
        if(root.left == null) return minDepth(root.right)+1;
        //only left subtree exists
        if(root.right == null) return minDepth(root.left)+1;
    //recursively call lagege
     return Math.min(
                minDepth(root.left),
                minDepth(root.right)
        ) + 1;
    }
}