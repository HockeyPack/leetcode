/**
 *
 */
package me.hockey.learn.leetcode5;

/**
 *
 *
 * 2020/5/20 13:41
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode5Test {
    public static void main(String[] args) {
        String source = "babad";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "ccc";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "cccc";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "ac";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "cbbd";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "cbbddbbc";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "cbbdadbbc";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

        source = "cbbdadbbce";
        System.out.println(new SolutionToLongTime().longestPalindrome(source));
        System.out.println(new Solution().longestPalindrome(source));

    }
}
