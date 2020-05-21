/**
 *
 */
package me.hockey.learn.leetcode214;

import java.util.Stack;

/**
 *
 *
 * 2020/5/21 23:35
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class PalindromeUtil {
    public boolean isPalindrome(String s) {
        if(s == null || s.trim().isEmpty() || s.trim().length() == 1){
            return true;
        }
        char[] charArray = s.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        Stack<Character> stack = new Stack<>();
        charArray = builder.toString().toCharArray();
        int mid = charArray.length / 2;
        int i = 1;
        for(char ch : charArray){
            if(i <= mid){
                i++;
                stack.push(ch);
            }else {
                if(ch == stack.peek()){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
