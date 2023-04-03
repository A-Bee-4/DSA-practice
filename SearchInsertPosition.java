/*
leetcode 
35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int midpoint = left + (right - left)/2;
            if(nums[midpoint] == target){
                return midpoint;
            }else if(nums[midpoint] < target){
                left = midpoint + 1;
            }else
                right = midpoint - 1;
        }

        return left;

    }
}
