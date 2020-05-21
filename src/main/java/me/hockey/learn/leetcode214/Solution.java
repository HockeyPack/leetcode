/**
 *
 */
package me.hockey.learn.leetcode214;

import java.util.TreeSet;

/**
 *
 *
 * 给定一个字符串 s，你可以通过在字符串前面添加字符将其转换为回文串。找到并返回可以用这种方式转换的最短回文串。
 *
 * 示例 1:
 *
 * 输入: "aacecaaa"
 * 输出: "aaacecaaa"
 * 示例 2:
 *
 * 输入: "abcd"
 * 输出: "dcbabcd"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *  //超出时间限制
 *
 * 2020/5/21 16:44
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    //思路从[0....end]是找到从0-n的回文子串，然后添加到n-end的部分即可组成最小的回文子串
    public String shortestPalindrome(String s) {
        if(s == null || s.isEmpty() || s.length() == 1){
            return s;
        }
        int toIndex = s.length() - 1;
        int fromIndex = 0;
        int endFlag = 0;
        while (toIndex > fromIndex){
            endFlag = toIndex;
            while (toIndex > fromIndex){
                if(s.charAt(toIndex) == s.charAt(fromIndex)){
                    toIndex --;
                    fromIndex ++;
                }else {
                    break;
                }
            }
            if(toIndex <= fromIndex){
                break;
            }else{
                //这个步骤是否可以做 跳跃的操作，不需要做减一
                //"bcacecaacb" -->bca ceca acb
                //[0 ... endFlag] 不是 回文子串，到[fromIndex..toIndex]不是回文子串
                if(endFlag > fromIndex) {
                    toIndex = endFlag - 1;
                }
                fromIndex = 0;
                endFlag = 0;
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        endFlag ++ ;
        while (endFlag <= s.length() - 1){
            builder.insert(0,s.charAt(endFlag));
            endFlag ++;
        }
        return builder.toString();
    }
}
