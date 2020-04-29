/**
 *
 */
package me.hockey.learn.leetcode1095;

import sun.applet.Main;

/**
 *
 *
 * 2020/4/29 21:43
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode1095Test {
    public static void main(String[] args) {
        System.out.println(new Solution().findInMountainArray(1,new SimpleMountainArray()));
    }


    public static class SimpleMountainArray implements  MountainArray{
        //int[] mountArray = new int[]{1,2,3,4,5,7,10,20,50,90,70,66,55,50,44,33,22,11,9,4,1};
        int[] mountArray = new int[]{1,3,4,2};
        @Override
        public int get(int index) {
            return mountArray[index];
        }

        @Override
        public int length() {
            return mountArray.length;
        }
    }
}
