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
public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }else {
                return -1;
            }
        }


        int [] pre = new int[nums.length/2];
        System.arraycopy(nums,0,pre,0,pre.length);

        int [] after = new int[(nums.length+1)/2];
        System.arraycopy(nums,pre.length,after,0,after.length);

        int index = -1;
        //前部分顺序排列
        if(pre[0] <= pre[pre.length-1]){
            //后部分顺序排列
            if(after[0] <= after[after.length-1]){
                //前半部分搜索
                if(pre[0] <= target && pre[pre.length-1] >= target){
                    index = search(pre,target);
                }
                //后半部分搜索
                if(after[0] <= target && after[after.length-1] >= target){
                    index = search(after,target);
                    if(index != -1){
                        index = pre.length + index;
                    }
                }
            }else{
                //后半部分不是顺序的，使用前部分进行筛选
                if(pre[0] <= target && pre[pre.length-1] >= target){
                    index = search(pre,target);
                }else{
                    index = search(after,target);
                    if(index != -1){
                        index = pre.length + index;
                    }
                }
            }
        }else{
            //前半部分不是顺序的，使用后半部分进行筛选
            if(after[0] <= target && after[after.length-1] >= target){
                index = search(after,target);
                if(index != -1){
                    index = pre.length + index;
                }
            }else {
                index = search(pre,target);

            }
        }

        return index;
    }
}