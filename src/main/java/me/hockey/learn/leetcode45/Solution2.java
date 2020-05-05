/**
 *
 */
package me.hockey.learn.leetcode45;

/**
 *
 *
 * 2020/5/5 13:44
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class Solution2 {
    public int jump(int[] nums) {
        int step = 0;
        //记录到nums[nums.length-1]的前一步的最小位置indexi;
        //递归查找到0,表示接受
        int index =  nums.length-1;
        while (index  > 0){
            index = findMinPrePositionToCurrentIndex(nums,index);
            step ++;
        }
        return step;
    }


    public int findMinPrePositionToCurrentIndex(int[] nums,int stepTo){
        if(stepTo == 0){
            return 0;
        }else {
            for (int index = 0; index < stepTo - 1; index++) {
                if (nums[index] + index >= stepTo) {
                    return index;
                }
            }
        }
        return -1;
    }
}
