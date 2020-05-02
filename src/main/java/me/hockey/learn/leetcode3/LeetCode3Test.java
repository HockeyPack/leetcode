/**
 *
 */
package me.hockey.learn.leetcode3;

/**
 *
 *
 * 2020/5/2 15:15
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode3Test {
    public static void main(String[] args) {

        String source = "1123abcabc";
        System.out.println(new Solution().lengthOfLongestSubstring(source));
        source = "abcabcbb";
        System.out.println(new Solution().lengthOfLongestSubstring(source));
        source = "bbbbb";
        System.out.println(new Solution().lengthOfLongestSubstring(source));
        source = "pwwkew";
        System.out.println(new Solution().lengthOfLongestSubstring(source));
    }
}
