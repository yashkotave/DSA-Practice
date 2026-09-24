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
       while(root!= null){
        //both on left side
        if(p.val<root.val && q.val <root.val){
            root = root.left;
        }
        //both on right
        else if(p.val >root.val && q.val >root.val){
            root = root.right;
        }
        //they split
        else{
            return root;
        }
       } 
       return null;
    }
}