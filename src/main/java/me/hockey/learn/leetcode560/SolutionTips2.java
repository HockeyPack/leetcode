/**
 *
 */
package me.hockey.learn.leetcode560;

/**
 * O(n²)
 *
 * 2020/5/16 23:41
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class SolutionTips2 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
