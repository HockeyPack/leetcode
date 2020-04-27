/**
 *
 */
package me.hockey.learn.leetcode349;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 * 2020/4/27 12:15
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> joinSet = new HashSet<>();
        for(int numInFirst : nums1){
            firstSet.add(numInFirst);
        }
        for(int numInSecond : nums2){
            if(firstSet.contains(new Integer(numInSecond))){
                firstSet.remove(new Integer(numInSecond));
                joinSet.add(new Integer(numInSecond));
            }
        }
        int[] result = new int[joinSet.size()];
        int index = 0;
        for(Integer each : joinSet){
            result[index] = each;
            index ++;
        }
        return result;
    }
}
