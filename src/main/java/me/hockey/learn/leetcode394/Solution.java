/**
 *
 */
package me.hockey.learn.leetcode394;

import java.util.Stack;

/**
 *
 *
 * 2020/5/28 20:19
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public String decodeString(String s) {
        StringBuilder allCharBuilder = new StringBuilder();
        Stack<StringBuilder> eachCharStack = new Stack<>();
        Stack<Integer> eachCountBuilder = new Stack<>();
        StringBuilder digitBuilder = new StringBuilder();
        for(int index = 0; index < s.length(); index++){
            char ch = s.charAt(index);
            if(ch >= '0' && ch <= '9'){
                digitBuilder.append(ch);
            }else if(ch == '['){
                int tempCount = Integer.parseInt("" + digitBuilder.toString());
                eachCountBuilder.push(tempCount);
                eachCharStack.push(new StringBuilder());
                digitBuilder.delete(0,digitBuilder.length());
            }else if (ch == ']'){
                StringBuilder builder = eachCharStack.pop();
                int count = eachCountBuilder.pop();
                if(eachCharStack.isEmpty()){
                    for(int tempCount = 1; tempCount <= count; tempCount++ ){
                        allCharBuilder.append(builder);
                    }
                }else{
                    for(int tempCount = 1; tempCount <= count; tempCount++ ){
                        eachCharStack.peek().append(builder);
                    }
                }
            }else {
                if(eachCharStack.isEmpty()){
                    allCharBuilder.append(ch);
                }else {
                    eachCharStack.peek().append(ch);
                }
            }
        }
        return allCharBuilder.toString();
    }
}
