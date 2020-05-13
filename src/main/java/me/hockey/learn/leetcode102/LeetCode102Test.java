/**
 *
 */
package me.hockey.learn.leetcode102;

import java.util.List;

/**
 *
 *
 * 2020/5/13 11:06
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode102Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = new Solution().levelOrder(root);
        System.out.println(result);
    }
}
