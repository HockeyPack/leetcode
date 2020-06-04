/**
 *
 */
package me.hockey.learn.leetcode84;

/**
 *
 *
 * 2020/5/30 14:33
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode84Test {
    public static void main(String[] args) {
        int[] heights = new int[]{2,1,5,6,2,3};
        System.out.println(new Solution().largestRectangleArea(heights));
        System.out.println(new Solution2().largestRectangleArea(heights));

        heights = new int[]{2,0,2};
        System.out.println(new Solution().largestRectangleArea(heights));
        System.out.println(new Solution2().largestRectangleArea(heights));

        heights = new int[]{1};
        System.out.println(new Solution().largestRectangleArea(heights));
        System.out.println(new Solution2().largestRectangleArea(heights));

        heights = new int[]{2,1,2};
        System.out.println(new Solution().largestRectangleArea(heights));
        System.out.println(new Solution2().largestRectangleArea(heights));
    }
}
