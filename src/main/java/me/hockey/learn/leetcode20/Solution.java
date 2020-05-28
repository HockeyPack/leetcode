/**
 *
 */
package me.hockey.learn.leetcode20;

import java.util.Stack;

/**
 *
 *
 * 2020/5/28 21:03
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int index = 0; index < s.length(); index++){
            char ch = s.charAt(index);
            if(ch == '['
                    || ch =='('
                    || ch == '{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char popCh = stack.pop();
                int result = ch - popCh;
                if(result != 1 && result != 2){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}