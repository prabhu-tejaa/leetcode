class Solution {
public int search(int[] nums, int target) {
    int start = 0, end = nums.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // If the target is found, return the index
        if (nums[mid] == target) {
            return mid;
        }

        // Handle duplicates: skip duplicates by moving start
        if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
            start++;
            end--;
            continue;
        }

        // Determine which side is sorted
        if (nums[start] <= nums[mid]) { // Left half is sorted
            if (nums[start] <= target && target < nums[mid]) {
                end = mid - 1; // Target is in the left sorted part
            } else {
                start = mid + 1; // Target is in the right part
            }
        } else { // Right half is sorted
            if (nums[mid] < target && target <= nums[end]) {
                start = mid + 1; // Target is in the right sorted part
            } else {
                end = mid - 1; // Target is in the left part
            }
        }
    }

    // If the target is not found
    return -1;
}
}