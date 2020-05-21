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
 *执行用时 :
 * 40 ms
 * , 在所有 Java 提交中击败了
 * 66.21%
 * 的用户
 * 内存消耗 :
 * 38.3 MB
 * , 在所有 Java 提交中击败了
 * 24.10%
 * 的用户
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
            int currentMaxLength = 1;
            int nextFromIndex = index;
            int nextToIndex = index;
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
            if(index > 0){
                nextFromIndex = index - 1;
                nextToIndex = index;
                boolean isPDouble= s.charAt(nextFromIndex)== s.charAt(nextToIndex);
                if (!isPDouble){
                    continue;
                }
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
        if(maxLength > 1){
            return s.substring(from,to+1);
        }
        return s.substring(from,to);
    }
}
