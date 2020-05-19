/**
 *
 */
package me.hockey.learn.leetcode234;

import java.util.Stack;

/**
 *
 *
 * 2020/5/19 22:50
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode find = head;
        int size = 0;
        while (find != null){
            size ++;
            find = find.next;
        }

        if(size == 1){
            return true;
        }

        find = head;
        int mid = size / 2;
        int i = 1;
        Stack<Integer> stack = new Stack<>();
        while(find != null){
            if(i <= mid){
                i++;
                stack.push(find.val);
            }else {
                if(find.val == stack.peek()){
                    stack.pop();
                }
            }
            find = find.next;
        }
        return stack.isEmpty();
    }
}