/**
 *
 */
package me.hockey.learn.leetcode7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 *
 * 2020/4/26 14:26
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int reverse(int x) {
        StringBuilder builder = new StringBuilder(Integer.toString(x));
        builder.reverse();
        BigInteger integer = null;
        Byte sign = null;
        if(x < 0){
            builder.deleteCharAt(builder.length()-1);
            builder.insert(0,'-');
            integer = new BigInteger(builder.toString());
            if(integer.compareTo(new BigInteger(Integer.toString(Integer.MIN_VALUE))) < 0 ) {
                return 0;
            }
        }else {
            integer = new BigInteger(builder.toString());
            if(integer.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE))) > 0 ) {
                return 0;
            }
        }
        return integer.intValue();
    }
}
