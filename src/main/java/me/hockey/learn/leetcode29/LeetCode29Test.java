/**
 *
 */
package me.hockey.learn.leetcode29;

import java.util.Arrays;

/**
 *
 *
 * 2020/6/5 22:59
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode29Test {

    public static void main(String[] args) {
        int[][] source = new int[1][0];
        System.out.println(Arrays.toString(new Solution().spiralOrder(source)));

        source = new int[0][1];
        System.out.println(Arrays.toString(new Solution().spiralOrder(source)));

        source = new int[0][0];
        System.out.println(Arrays.toString(new Solution().spiralOrder(source)));

        source = new int[1][2];
        source[0][0] = 1;
        source[0][1] = 2;
        System.out.println(Arrays.toString(new Solution().spiralOrder(source)));

        source = new int[2][1];
        source[0][0] = 1;
        source[1][0] = 2;
        System.out.println(Arrays.toString(new Solution().spiralOrder(source)));

        source = new int[2][2];
        source[0][0] = 1;
        source[0][1] = 2;
        source[1][0] = 4;
        source[1][1] = 3;
        System.out.println(Arrays.toString(new Solution().spiralOrder(source)));

        source = new int[3][3];
        source[0][0] = 1;
        source[0][1] = 2;
        source[0][2] = 3;
        source[1][0] = 4;
        source[1][1] = 5;
        source[1][2] = 6;
        source[2][0] = 7;
        source[2][1] = 8;
        source[2][2] = 9;
        System.out.println(Arrays.toString(new Solution().spiralOrder(source)));

    }
}
