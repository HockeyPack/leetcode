/**
 *
 */
package me.hockey.learn.leetcode136;

/**
 * 题目有要求不使用额外的空间存储,想到了用操作符来进行运算，但是没有想到用异或运算
 *
 * 2020/5/15 16:59
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i ++){
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
