/**
 *
 */
package me.hockey.learn.leetcode234;

/**
 *
 *
 * 2020/5/19 22:57
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode234Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        System.out.println(new Solution().isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(new Solution().isPalindrome(head));


        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        System.out.println(new Solution().isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);
        System.out.println(new Solution().isPalindrome(head));



    }
}
