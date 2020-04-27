/**
 *
 */
package me.hockey.learn.leetcode349;

/**
 *
 *
 * 2020/4/27 12:21
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode349Test {
    public static void main(String[] args) {
        int [] first = new int[]{1,2,2,4,5,6,6,7};
        int [] second = new int[]{1,2,2,5,10,5,7,6,7};
        int[] result = new Solution().intersection(first,second);
        System.out.print("[");
        boolean head = true;
        for(int each : result){
            if(!head){
                System.out.print(",");
            }else {
                head = false;
            }
            System.out.print(each);
        }
        System.out.print("]");
    }
}
