// Last updated: 4/16/2025, 4:41:44 AM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int numsLength = nums.length;

        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[numsLength-k+1];

        for(int i = 0;i<numsLength;i++){

            while(!deque.isEmpty() && deque.peekFirst() < i-k+1){
                deque.pollFirst();
            }
            
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            
            deque.offerLast(i);

            if(i>=k-1){
                ans[i-k+1] = nums[deque.peekFirst()];
            }
        }
        return ans;
    }
}