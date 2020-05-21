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
class SolutionToLongTime {
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
            //中间为s.charAt(index)
            boolean isP= isPalindrome(builder.toString());
            while (isP) {

                if(currentMaxLength > maxLength){
                    from = nextFromIndex;
                    to = nextToIndex;
                    maxLength = currentMaxLength;
                }

                if(nextFromIndex == 0){
                    if(currentMaxLength > maxLength){
                        from = nextFromIndex;
                        to = nextToIndex;
                        maxLength = currentMaxLength;
                    }
                    break;
                }
                if(nextToIndex == s.length() -1){
                    if(currentMaxLength > maxLength){
                        from = nextFromIndex;
                        to = nextToIndex;
                        maxLength = currentMaxLength;
                    }
                    break;
                }

                if(nextFromIndex < 0){
                    nextFromIndex = 0;
                    if(currentMaxLength > maxLength){
                        from = nextFromIndex;
                        to = nextToIndex;
                        maxLength = currentMaxLength;
                    }
                    break;
                }
                if(nextToIndex > s.length() - 1){
                    nextToIndex = s.length()-1;
                    if(currentMaxLength > maxLength){
                        from = nextFromIndex;
                        to = nextToIndex;
                        maxLength = currentMaxLength;
                    }
                    break;
                }




                nextFromIndex -- ;
                nextToIndex ++;
                builder.insert(0,s.charAt(nextFromIndex));
                builder.append(s.charAt(nextToIndex));
                if(isP = isPalindrome(builder.toString())){
                    currentMaxLength += 2;
                    if(currentMaxLength > maxLength){
                        from = nextFromIndex;
                        to = nextToIndex;
                        maxLength = currentMaxLength;
                    }
                }
            }
            builder.delete(0,builder.length());
            if(index > 0){
                nextFromIndex = index - 1;
                nextToIndex = index;
                currentMaxLength = 2;
                builder.insert(0,s.charAt(nextFromIndex));
                builder.append(s.charAt(nextToIndex));
                boolean isPDouble= isPalindrome(builder.toString());
                while (isPDouble){

                    if(currentMaxLength > maxLength){
                        from = nextFromIndex;
                        to = nextToIndex;
                        maxLength = currentMaxLength;
                    }

                    if(nextFromIndex == 0){
                        if(currentMaxLength > maxLength) {
                            from = nextFromIndex;
                            to = nextToIndex;
                            maxLength = currentMaxLength;
                        }
                        break;
                    }
                    if(nextToIndex == s.length() -1){
                        if(currentMaxLength > maxLength) {
                            from = nextFromIndex;
                            to = nextToIndex;
                            maxLength = currentMaxLength;
                        }
                        break;
                    }
                    if(nextFromIndex < 0){
                        nextFromIndex = 0;
                        if(currentMaxLength > maxLength){
                            from = nextFromIndex;
                            to = nextToIndex;
                            maxLength = currentMaxLength;
                        }
                        break;
                    }
                    if(nextToIndex > s.length()-1){
                        nextToIndex = s.length()-1;
                        if(currentMaxLength > maxLength){
                            from = nextFromIndex;
                            to = nextToIndex;
                            maxLength = currentMaxLength;
                        }
                        break;
                    }

                    nextFromIndex -- ;
                    nextToIndex ++;
                    builder.insert(0,s.charAt(nextFromIndex));
                    builder.append(s.charAt(nextToIndex));

                    isPDouble = isPalindrome(builder.toString());
                    if(isPDouble){
                        currentMaxLength += 2;
                        if(currentMaxLength > maxLength){
                            from = nextFromIndex;
                            to = nextToIndex;
                            maxLength = currentMaxLength;
                        }
                    }
                }
            }
        }
        if(maxLength > 1){
            return s.substring(from,to +1);
        }
        return s.substring(from,to);

    }


    private boolean isPalindrome(String s) {
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
        boolean singleMid = charArray.length % 2 == 1;
        int i = 1;
        for(char ch : charArray){
            if(i <= mid){
                i++;
                stack.push(ch);
            }else{
                if(singleMid && i == mid + 1){
                    i++;
                    continue;
                }
                if(stack.isEmpty()){
                    return false;
                }
                if(ch == stack.peek()){
                    stack.pop();
                }
                i++;
            }
        }
        return stack.isEmpty();
    }
}
