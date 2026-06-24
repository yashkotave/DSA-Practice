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
    public List<List<Integer>> levelOrder(TreeNode root) {

        // Final answer list
        List<List<Integer>> ans = new ArrayList<>();

        // Edge case: empty tree
        if (root == null) {
            return ans;
        }

        // Queue for BFS traversal
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        // Process level by level
        while (!q.isEmpty()) {

            // Number of nodes in current level
            int size = q.size();

            // Store all nodes of current level
            List<Integer> level = new ArrayList<>();

            // Process current level
            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                // Add node value to level list
                level.add(curr.val);

                // Add left child if present
                if (curr.left != null) {
                    q.offer(curr.left);
                }

                // Add right child if present
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            // Add current level to answer
            ans.add(level);
        }

        return ans;
    }
}