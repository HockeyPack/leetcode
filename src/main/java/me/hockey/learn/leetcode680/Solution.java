/**
 *
 */
package me.hockey.learn.leetcode680;

/**
 *
 *
 * 2020/5/19 11:19
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public boolean validPalindrome(String s) {
        return validPalindrome(s,true);
    }

    /**
     *
     * @param s
     * @param noDelete 表示调用方已经删除了一个字符，现在的字符串只能是回文子串了。
     * @return
     */
    private boolean validPalindrome(String s, boolean noDelete){
        if(s == null){
            return false;
        }
        if(s.length() == 1){
            return true;
        }

        if(s.length() == 2){
            return noDelete || s.charAt(0) == s.charAt(1);
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        boolean afterDeleteLeft = false;
        boolean afterDeleteRight = false;
        while (stringBuilder.length() > 0){
            if(stringBuilder.charAt(0) == stringBuilder.charAt(stringBuilder.length()-1)){
                stringBuilder.deleteCharAt(stringBuilder.length() -1);
                stringBuilder.deleteCharAt(0);
                if(stringBuilder.length() == 0 || stringBuilder.length() == 1){
                    return true;
                }
                continue;
            }
            if(noDelete){
                if(stringBuilder.length() <= 2){
                    return  true;
                }
            }else{
                //因为调用方已经是截取后的子串了，存在不匹配的情况，就不能构成回文串了。
                return noDelete;
            }
            //删除一个字符形成回文串
            afterDeleteLeft = validPalindrome(stringBuilder.substring(1),false);
            if(!afterDeleteLeft){
                afterDeleteRight = validPalindrome(stringBuilder.substring(0,stringBuilder.length() - 1),false);
            }
            break;
        }
        return  afterDeleteLeft || afterDeleteRight;
    }
}
