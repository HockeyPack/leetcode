/**
 *
 */
package me.hockey.learn.leetcode560;

import java.util.*;

/**
 * O(N)
 * 2020/5/15 10:46
 * @version 1.0.0
 * @author he.jiepeng
 *
 */

class SolutionTips {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sumToCurrent = 0;
        HashMap <Integer, Integer> mp = new HashMap <> ();
        //处理第一个位置k 且 nums[k] == k 的情况
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sumToCurrent += nums[i];
            //pre < current 且 sumToCurrent - k = sumToPre
            int sumToPre = sumToCurrent - k;
            if (mp.containsKey(sumToPre)) {
                count += mp.get(sumToPre);
            }
            mp.put(sumToCurrent, mp.getOrDefault(sumToCurrent, 0) + 1);
        }
        return count;
    }
}
