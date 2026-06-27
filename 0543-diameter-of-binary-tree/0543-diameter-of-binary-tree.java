class Solution {

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }
// Diameter = Number of EDGES

// Therefore:

// int selfDiameter = leftHeight + rightHeight;

// NOT

// leftHeight + rightHeight + 1

// because +1 gives diameter in terms of nodes.

// Complexity
// Time  : O(N²)
// Space : O(H)

// where H is the height of the tree.
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight;

        return Math.max(selfDiameter,
                Math.max(leftDiameter, rightDiameter));
    }

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) +1;
    }
}