/**
 *
 */
package me.hockey.learn.leetcode76;

/**
 *
 *
 * 2020/5/23 14:04
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode76Test {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(new Solution().minWindow(s,t));
        System.out.println(new SolutionTips().minWindow(s,t));

        s = "a";
        t = "aa";
        System.out.println(new Solution().minWindow(s,t));
        System.out.println(new SolutionTips().minWindow(s,t));

        s = "aa";
        t = "aa";
        System.out.println(new Solution().minWindow(s,t));
        System.out.println(new SolutionTips().minWindow(s,t));
    }
}
