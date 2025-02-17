class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        int numsSize = nums.length;
        for(int num : nums){
            set.add(num);
        }

        for(int i=1;i<=numsSize;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}