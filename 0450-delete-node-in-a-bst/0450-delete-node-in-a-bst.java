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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(key<root.val) root.left = deleteNode(root.left,key); //search in right subtree
        else if(key>root.val) root.right = deleteNode (root.right,key); //search in left subtree
        else{
            if(root.left == null) return root.right; //case1 no left child
            if(root.right == null ) return root.left; //case2 no right child
            TreeNode successor = findMin(root.right); //  case 2 bachee
            root.val = successor.val; //inorder successor -> smallest value in right subtrre 
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }
    private TreeNode findMin(TreeNode root){
        while(root.left!=null){
            root = root.left;
        }
    return root;
    }
}