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
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean check(TreeNode root , long min, long max){
        //khali tree valid hota hai
        if(root == null) return true;
        //conditionn kharab krga toh false 
        if(root.val<=min || root.val>=max) return false;

        //check left subtree
        if(!check(root.left,min,root.val)){
             return false;
        }
        //check right subtree
        if(!check(root.right,root.val,max)) {
            return false;
        }
        return true;        
    }
}