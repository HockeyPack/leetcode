/**
 *
 */
package me.hockey.learn.leetcode53;


/**
 *
 *
 * 2020/5/3 17:40
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int before = 0;
        boolean head = true;
        for(int num : nums){
            if(head){
                before = num;
                max = num;
                head = false;
            }else{
                if(num < before + num){
                    before = before + num;
                }else {
                    before = num;
                }
                if(max < before){
                    max = before;
                }
            }
        }
        return max;
    }
}