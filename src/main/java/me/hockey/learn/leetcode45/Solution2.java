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
        //1、令index为 nums.length-1;
        //2、查找到nums[index]的前一步的最小位置indexPre，步数加一;
        //3、每次重复2，直到index到 0,
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
            for (int index = 0; index < stepTo; index++) {
                if (nums[index] + index >= stepTo) {
                    return index;
                }
            }
        }
        return -1;
    }
}
