// Last updated: 4/26/2025, 6:35:13 AM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inOrderList(root1, list1);
        inOrderList(root2, list2);

        return mergedList(list1, list2);
    }

    private void inOrderList(TreeNode root, List<Integer> list){
        if(root == null) return;

        inOrderList(root.left, list);
        list.add(root.val);
        inOrderList(root.right, list);
    }

    private List<Integer> mergedList(List<Integer> list1, List<Integer> list2){
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        int list1Size = list1.size();
        int list2Size = list2.size();

        while(i<list1Size && j<list2Size){
            if(list1.get(i) < list2.get(j)){
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }

        while(i<list1Size){
            result.add(list1.get(i++));
        }
        while(j<list2Size){
            result.add(list2.get(j++));
        }

        return result;
    }
}