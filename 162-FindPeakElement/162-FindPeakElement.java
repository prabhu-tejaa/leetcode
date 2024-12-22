class Solution {
    public int findPeakElement(int[] nums) {
        int arrSize = nums.length;
        int start = 0;
        int end = arrSize - 1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}