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
class Solution2 {
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
        int lIndex = 0;
        int rIndex = s.length() - 1;
        boolean afterDeleteLeft = false;
        boolean afterDeleteRight = false;
        while (lIndex <= rIndex){
            if(lIndex == rIndex){
                return true;
            }
            if(s.charAt(lIndex) == s.charAt(rIndex)){
                if(lIndex + 1 == rIndex ){
                    return true;
                }
                lIndex++;
                rIndex--;
                continue;
            }
            if(!noDelete){
                //因为调用方已经是截取后的子串了，存在不匹配的情况，就不能构成回文串了。
                return noDelete;
            }else {
                if(lIndex + 1 == rIndex ){
                    return true;
                }
            }
            //删除一个字符形成回文串
            String rSub = s.substring(lIndex + 1,rIndex + 1);
            afterDeleteLeft = validPalindrome(rSub,false);
            if(!afterDeleteLeft){
                String lSub = s.substring(lIndex ,rIndex);
                afterDeleteRight = validPalindrome(lSub,false);
            }
            break;
        }
        return  afterDeleteLeft || afterDeleteRight;
    }
}
