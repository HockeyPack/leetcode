/**
 *
 */
package me.hockey.learn.leetcode5;

import java.util.Stack;

/**
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 能执行，但是效率太低了，超过正常时间。
 *
 * 2020/5/20 12:43
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return s;
        }

        int from = 0;
        int to = 1;
        int maxLength = 1;

        for(int index = 0; index < s.length(); index++){
            StringBuilder builder = new StringBuilder();
            int currentMaxLength = 1;
            int nextFromIndex = index;
            int nextToIndex = index;
            builder.append(s.charAt(index));
            while ((nextFromIndex) >= 0
                    && (nextToIndex) <= s.length() -1
                    && s.charAt(nextFromIndex) == s.charAt(nextToIndex)){
                if(nextFromIndex == nextToIndex){
                    nextFromIndex--;
                    nextToIndex ++;
                    continue;
                }
                currentMaxLength += 2;
                if(currentMaxLength > maxLength){
                    from = nextFromIndex;
                    to = nextToIndex;
                    maxLength = currentMaxLength;
                }
                nextFromIndex--;
                nextToIndex ++;
            }
            builder.delete(0,builder.length());
            if(index > 0){
                nextFromIndex = index - 1;
                nextToIndex = index;
                builder.insert(0,s.charAt(nextFromIndex));
                builder.append(s.charAt(nextToIndex));
                boolean isPDouble= builder.charAt(0)== builder.charAt(1);
                if (isPDouble){
                    currentMaxLength = 2;
                    if(currentMaxLength > maxLength){
                        from = nextFromIndex;
                        to = nextToIndex;
                        maxLength = currentMaxLength;
                    }
                    while ((nextFromIndex) >= 0
                            && (nextToIndex) <= s.length() -1
                            && s.charAt(nextFromIndex) == s.charAt(nextToIndex)){
                        if(nextFromIndex+1 == nextToIndex){
                            nextFromIndex--;
                            nextToIndex ++;
                            continue;
                        }
                        currentMaxLength += 2;
                        if(currentMaxLength > maxLength){
                            from = nextFromIndex;
                            to = nextToIndex;
                            maxLength = currentMaxLength;
                        }
                        nextFromIndex--;
                        nextToIndex ++;
                    }
                }
            }
        }
        if(maxLength > 1){
            return s.substring(from,to+1);
        }
        return s.substring(from,to);
    }
}
