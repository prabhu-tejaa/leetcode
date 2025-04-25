// Last updated: 4/26/2025, 3:08:38 AM
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
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> tempStorage = new ArrayList<>();

            for(int i = 0;i<queueSize;i++){
                TreeNode tempValue = queue.poll();
                tempStorage.add(tempValue.val);

                if(tempValue.left != null){
                    queue.offer(tempValue.left);
                }

                if(tempValue.right != null){
                    queue.offer(tempValue.right);
                }
            }
            result.add(tempStorage);
        }
        return result;
    }
}