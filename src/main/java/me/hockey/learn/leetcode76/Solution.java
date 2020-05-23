/**
 *
 */
package me.hockey.learn.leetcode76;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。
 *
 * 示例：
 *
 * 输入: S = "ADOBECODEBANC", T = "ABC"
 * 输出: "BANC"
 * 说明：
 *
 * 如果 S 中不存这样的子串，则返回空字符串 ""。
 * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-window-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 2020/5/23 12:27
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.length() == 0){
            return "";
        }
        String result = "";
        StringBuilder builder = new StringBuilder();
        Set<Character> notMatchSet = new HashSet<>();
        Map<Character,Integer> allMatchMap = new HashMap<>();
        Map<Character,Integer> matchCountMap = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            allMatchMap.put(ch,allMatchMap.getOrDefault(ch,0) + 1);
            notMatchSet.add(ch);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(allMatchMap.get(ch) != null){
                builder.append(ch);
                int count = matchCountMap.getOrDefault(ch,0) + 1;
                matchCountMap.put(ch,count);
                if(count >= allMatchMap.get(ch)){
                    notMatchSet.remove(ch);
                }
                //移除前面重复的部分
                while ((!allMatchMap.containsKey(builder.charAt(0)))//不需要的字符
                        || (matchCountMap.get(builder.charAt(0)) != null && matchCountMap.get(builder.charAt(0)) > allMatchMap.get(builder.charAt(0)))){//多余的适配字符
                    char removeChar = builder.charAt(0);
                    builder.deleteCharAt(0);
                    if(matchCountMap.containsKey(removeChar)){
                        matchCountMap.put(removeChar,matchCountMap.get(removeChar) - 1);
                    }
                }
                if(notMatchSet.isEmpty()){
                    if(result.length() == 0){
                        result = builder.toString();
                    }else {
                        if(result.length() > builder.length()){
                            result = builder.toString();
                        }
                    }
                }
            }else{
                if(builder.length() != 0){
                    builder.append(ch);
                }
            }
        }
        return result;
    }
}
