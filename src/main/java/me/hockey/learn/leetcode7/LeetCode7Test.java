/**
 *
 */
package me.hockey.learn.leetcode7;

/**
 *
 *
 * 2020/4/26 14:44
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode7Test {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(new Solution().reverse(-2147483648));
        System.out.println(new Solution().reverse(2147483646));

        System.out.println(new Solution().reverse(123));
        System.out.println(new Solution().reverse(-123));
        System.out.println(new Solution().reverse(-0));
    }
}
