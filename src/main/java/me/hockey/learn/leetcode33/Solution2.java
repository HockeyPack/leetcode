/**
 *
 */
package me.hockey.learn.leetcode33;

/**
 *
 *
 * 2020/4/27 10:42
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class Solution2 {
    public int search(int[] nums, int target) {
        return searchInner(nums, target,0, nums.length-1);
    }

    private int searchInner(int[] nums, int target,int from, int to) {
        if(from == to){
            if(nums[from] == target){
                return from;
            }else {
                return -1;
            }
        }


        int isolationIndex = (from + to)/2;

        int index = -1;
        //前部分顺序排列
        if(nums[from] <= nums[isolationIndex]){
            //后部分顺序排列
            if(nums[isolationIndex+1] <= nums[to]){
                //前半部分搜索
                if(nums[from] <= target && nums[isolationIndex] >= target){
                    index = searchInner(nums,target,from,isolationIndex);
                }
                //后半部分搜索
                if(nums[isolationIndex+1] <= target && nums[to] >= target){
                    index = searchInner(nums,target,isolationIndex+1,to);

                }
            }else{
                //后半部分不是顺序的，使用前部分进行筛选
                if(nums[from] <= target && nums[isolationIndex] >= target){
                    index = searchInner(nums,target,from,isolationIndex);
                }else{
                    index = searchInner(nums,target,isolationIndex+1,to);
                }
            }
        }else{
            //前半部分不是顺序的，使用后半部分进行筛选
            if(nums[isolationIndex+1] <= target && nums[to] >= target){
                index = searchInner(nums,target,isolationIndex+1,to);
            }else {
                index = searchInner(nums,target,from,isolationIndex);

            }
        }
        return index;
    }
}