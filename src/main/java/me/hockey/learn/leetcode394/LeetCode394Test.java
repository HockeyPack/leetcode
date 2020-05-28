/**
 *
 */
package me.hockey.learn.leetcode394;

/**
 *
 *
 * 2020/5/28 20:43
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode394Test {
    public static void main(String[] args) {
        String source = "3[a]2[bc]";
        System.out.println(new Solution().decodeString(source));

        source = "3[a2[c]]";
        System.out.println(new Solution().decodeString(source));

        source = "2[abc]3[cd]ef";
        System.out.println(new Solution().decodeString(source));

        source = "100[leetcode]";
        System.out.println(new Solution().decodeString(source));

    }
}
