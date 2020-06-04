/**
 *
 */
package me.hockey.learn.leetcode84;

/**
 *
 *
 * 2020/5/30 14:28
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        for(int index = 0; index < heights.length; index++){
            int height = heights[index];
            int width = 1;
            int pre = index;
            while (pre > 0){
                pre--;
                if(heights[pre] >= height){
                    width ++;
                }else{
                    break;
                }
            }
            int after = index;
            while (after < heights.length - 1){
                after ++;
                if(heights[after] >= height){
                    width ++;
                }else{
                    break;
                }
            }
            result = Math.max(result, width* height);

        }
        return result;
    }
}
