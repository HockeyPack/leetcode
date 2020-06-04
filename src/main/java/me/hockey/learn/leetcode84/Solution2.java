/**
 *
 */
package me.hockey.learn.leetcode84;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 *
 * 2020/5/31 18:02
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class Solution2 {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0){
            return 0;
        }
        if(heights.length == 1){
            return heights[0];
        }

        int result = 0;
        Deque<Integer> positionStack = new ArrayDeque();
        int [] tempHeight = new int[heights.length + 2];
        for(int i = 0; i< heights.length; i++){
            tempHeight[i+1]= heights[i];
        }
        heights = tempHeight;
        positionStack.addLast(0);
        for(int index = 1; index < heights.length; index++){
            int current = heights[index];
            while (current < heights[positionStack.peekLast()]){
                int prePosition = positionStack.pollLast();
                int range = index - positionStack.peekLast() - 1;
                result = Math.max(result,heights[prePosition] * range);
            }
            positionStack.addLast(index);
        }
        return result;
    }
}
