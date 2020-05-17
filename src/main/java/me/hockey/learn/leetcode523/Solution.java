/**
 *
 */
package me.hockey.learn.leetcode523;

import java.util.HashMap;

/**
 * 给定一个包含非负数的数组和一个目标整数 k，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，总和为 k 的倍数，即总和为 n*k，其中 n 也是一个整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/continuous-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 2020/5/17 11:16
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer,Integer> sumOfMinIndexMapping = new HashMap<>();
        sumOfMinIndexMapping.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(k != 0){
                int remainValue = sum % k;
                int matchValue = sum % k;
                if(sumOfMinIndexMapping.containsKey(matchValue)){
                    if(i - sumOfMinIndexMapping.get(matchValue) > 1){
                        return true;
                    }
                }
                //如果存在，则最小下标是之前的值，
                if(!sumOfMinIndexMapping.containsKey(remainValue)){
                    sumOfMinIndexMapping.put(remainValue,i);
                }
            }else{
                if(sumOfMinIndexMapping.containsKey(sum)){
                    if(i - sumOfMinIndexMapping.get(sum) > 1){
                        return true;
                    }
                }
                if(!sumOfMinIndexMapping.containsKey(sum)){
                    sumOfMinIndexMapping.put(sum,i);
                }
            }
        }
        return false;
    }
}