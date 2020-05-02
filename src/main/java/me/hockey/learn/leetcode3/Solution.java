/**
 *
 */
package me.hockey.learn.leetcode3;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 *
 * 2020/5/2 15:06
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int size = 0;
        StringBuilder builder = new StringBuilder();
        for(int strIndex = 0; strIndex < s.length(); strIndex++){
            String charStr = s.substring(strIndex,strIndex+1);
            int matchIndex = builder.indexOf(charStr);

            if (matchIndex == 0){
                builder.deleteCharAt(0);
            }
            if(matchIndex > 0){
                builder.delete(0,matchIndex+1);
            }
            builder.append(charStr);
            if(size < builder.length()){
                size = builder.length();
            }
        }
        return size;
    }
}