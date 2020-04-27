/**
 *
 */
package me.hockey.learn.leetcode354;



import java.util.TreeMap;

/**
 *
 *
 * 2020/4/26 13:03
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode354Test {
    public static void main( String[] args ) {
        int[][] envelopes = new int[4][2];
        int [] first = new int[]{5,4};
        envelopes[0] = first;
        int [] second = new int[]{6,4};
        envelopes[1] = second;
        int [] third = new int[]{6,7};
        envelopes[2] = third;
        int [] fourth = new int[]{2,3};
        envelopes[3] = fourth;
        int result = new Solution().maxEnvelopes(envelopes);
        System.out.println(result);
    }
}






