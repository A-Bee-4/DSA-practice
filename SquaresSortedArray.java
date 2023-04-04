/*
leetcode
977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

*/
// 1- Bubble Sort method
class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {



        for(int i = 0; i < nums.length; i++){
            nums[i]= nums[i] * nums[i];
        }
        int temp;
        for(int i = 0; i < nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}

// 2 - Array.sort() method
public class Solution {
   public int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] squares = new int[n];

    // Square each element and store in squares array
    for (int i = 0; i < n; i++) {
        squares[i] = nums[i] * nums[i];
    }

    // Sort the squares array in non-decreasing order
    Arrays.sort(squares);

    return squares;
    }
}
