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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base case
        if(root == null) return null;

        //current node is p and q
        if(root == p || root ==q) return root;

        //search left
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        
        // serach right
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        //p and q are on different sides
        if(left!= null && right != null) return root;

        //found in left
        if(left!= null) return left;
        
        //found in right 
        return right;

    }
}