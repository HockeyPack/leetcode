/**
 *
 */
package me.hockey.learn.leetcode125;

import java.util.Stack;

/**
 *
 *
 * 2020/5/19 22:28
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.trim().isEmpty() || s.trim().length() == 1){
            return true;
        }
        char[] charArray = s.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char ch : charArray){
            if(!Character.isLetterOrDigit(ch)){
                continue;
            }else{
                builder.append(ch);
            }
        }
        if(builder.length() == 1){
            return true;
        }
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
