/**
 *
 */
package me.hockey.learn.leetcode136;

/**
 *
 *
 * 2020/5/15 16:59
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode136Test {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{1,2,3,3,2,1,4,5,6,4,5,6,9,8,7,8,7,9,10}));
        System.out.println(new Solution().singleNumber(new int[]{1,2,3,3,2,1,4,5,6,10,4,5,6,9,8,7,8,7,9}));
        System.out.println(new Solution().singleNumber(new int[]{10,1,2,3,3,2,1,4,5,6,4,5,6,9,8,7,8,7,9}));
    }
}
