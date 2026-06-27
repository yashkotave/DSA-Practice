class Solution {
    int diameter =0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        //diamteerr in terms of Nodes
        //diamter = Math.max(diamter,lh+rh+1)

        diameter = Math.max(diameter,rh+lh);
        return Math.max(lh,rh)+1;
    }
}