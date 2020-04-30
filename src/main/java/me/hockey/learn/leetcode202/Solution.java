/**
 *
 */
package me.hockey.learn.leetcode202;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 * 2020/4/30 12:17
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> size = new HashSet<>();
        int value = n;
        size.add(new Integer(value));
        while (true){
            value =  replace(value);
            if (value == 1){
                return true;
            }
            if(size.contains(new Integer(value))){
                return false;
            }
            size.add(new Integer(value));
        }
    }

    public int replace(int n){
        int res = 0;
        while (n != 0) {
            int num = n % 10;
            res += num * num;
            n /= 10;
        }
        return res;
    }

}
