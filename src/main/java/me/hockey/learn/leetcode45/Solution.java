/**
 *
 */
package me.hockey.learn.leetcode45;

/**
 * 从nums[0]开始，每一个区间可以跳转到下一个区间的最大值，每次变化一个区间，步数加一
 *
 *
 * {2,3,1,1,4,2,3,4,1,1,4,3,2,4,5,2,3,4};
 * 第一步，再区间 [2]
 * 第二步 到区间[3,1],
 * 第三步 到区间[4,2]
 * 第四步 到区间[3,4,1]
 * 依次类推，没跳转一个区间，则步数加一
 * 直到跳到最后
 *
 * 实现位
 * 记录 当前步数step
 * 记录当前步数可以到达的最远位置 currentStepEnd，当前区间的最后位置;
 * 记录下一步可以跳转的最大位置 nextMaxStepEnd;下一个区间的最后位置
 * 从左到右遍历，记录下一步可以跳转的最大位置，即当前位置加上当前位置可以跳转的步数 及 index + nums[index]，记录到可以到达的最大位置。
 *      当位置到了nextMaxStepEnd
 *          则步数加一，
 *          并且currentStepEnd变成nextMaxStepEnd
 *
 *
 *
 * 2020/5/4 17:22
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int jump(int[] nums) {
        int nextMaxStepEnd = 0;
        int step = 0;
        int currentStepEnd = 0;
        for(int i = 0; i < nums.length -1; i++){
            nextMaxStepEnd = Math.max(nextMaxStepEnd, i + nums[i]);
            if(currentStepEnd == i){
                step++;
                currentStepEnd = nextMaxStepEnd;
            }
        }
        return step;
    }
}
