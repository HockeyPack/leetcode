/**
 *
 */
package me.hockey.learn.leetcode29;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 *
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 遍历即可
 *
 * 2020/6/5 22:24
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int xLength = matrix[0].length;
        int yLength = matrix.length;
        int capacity = xLength * yLength;
        int[] result = new int[capacity];
        int maxX = xLength - 1;
        int maxY = yLength - 1;
        int minX = 0;
        int minY = 0;
        int currentX = 0;
        int currentY = 0;
        int currentIndex = 0;
        int direct = 0;

        while (currentX >= minX && currentX <= maxX
                && currentY >= minY && currentY <= maxY) {
            result[currentIndex] = matrix[currentY][currentX];
            currentIndex++;
            if (currentIndex == xLength * yLength) {
                break;
            }
            if (direct == 0) {
                if (currentX == maxX) {
                    direct = 1;
                    currentY++;
                    minY++;
                } else {
                    currentX++;
                }
            } else if (direct == 1) {
                if (currentY == maxY) {
                    direct = 2;
                    currentX--;
                    maxX--;
                } else {
                    currentY++;
                }

            } else if (direct == 2) {
                if (currentX == minX) {
                    direct = 3;
                    currentY--;
                    maxY--;
                } else {
                    currentX--;
                }
                continue;
            } else {
                if (currentY == minY) {
                    direct = 0;
                    currentX++;
                    minX++;
                } else {
                    currentY--;
                }
            }
        }

        return result;

    }
}