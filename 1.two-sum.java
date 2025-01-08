/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i == j) {} 
                else {
                    if (nums[i] + nums[j] == target){
                        twoSum[0] = i;
                        twoSum[1] = j;
                        return twoSum;
                    }
                }
            }
        }
        return twoSum;
    }
}
// @lc code=end
