/**
 *
 */
package me.hockey.learn.leetcode680;

/**
 *
 *
 * 2020/5/19 12:21
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode680Test {
    public static void main(String[] args) {
        String source = "abc1dedcba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
        source = "abcd2edcba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
        source = "abcde3dcba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
        source = "abcded4cba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));

        source = "abcdd1cba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
        source = "abcd1dcba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
        source = "abc3ddcba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
        source = "abcd4dcba";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));

        source = "123";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));


        source = "12314";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
        source = "tebbem";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));

        source = "qnpemmugscxpogaqatzjvmfssensnahzuazzkiguzppabkczxvgeevxzckbappzgikzzauzhansnessfmvjztaqagopxcsgummepnq";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));

        source = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));

        source = "abc";
        System.out.println(source  + "        " + new Solution().validPalindrome(source));
        System.out.println(source  + "        " + new Solution2().validPalindrome(source));
    }
}
