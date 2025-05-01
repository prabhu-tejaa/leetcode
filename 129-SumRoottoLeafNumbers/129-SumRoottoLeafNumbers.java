// Last updated: 5/1/2025, 2:29:44 PM
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
    int totalSum = 0;

    public void preOrder(TreeNode root, int singlePath){
        if(root == null) return;

        singlePath = singlePath*10+root.val;

        if(root.left == null && root.right == null){
            totalSum += singlePath;
        }

        preOrder(root.left, singlePath);
        preOrder(root.right, singlePath);
    }

    public int sumNumbers(TreeNode root) {
        preOrder(root, 0);
        return totalSum; 
    }
}