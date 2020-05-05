/**
 *
 */
package me.hockey.learn.leetcode45;

/**
 * 这条参考了网上的题解，有两种思路
 *
 * 2020/5/5 13:27
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode45Test {
    public static void main(String[] args) {
        int[] source = new int[]{7,2,3,1,1,4,2,3,4,1,1,4,3,2,4,5,2,3,4};
        int solution1Result = new Solution().jump(source);
        int solution2Result = new Solution2().jump(source);
        System.out.println(solution1Result);
        System.out.println(solution2Result);
        System.out.println(solution1Result == solution2Result);
    }
}
