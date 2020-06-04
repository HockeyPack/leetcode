/**
 *
 */
package me.hockey.learn.leetcode101;

/**
 *
 *
 * 2020/6/4 12:22
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode101Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);


        root.right = new TreeNode(2);
        root.right.left  = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(new Solution().isSymmetric(root));

        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(1);


        root.right = new TreeNode(4);
        root.right.left  = new TreeNode(2);
        root.right.left.left = new TreeNode(2);

        System.out.println(new Solution().isSymmetric(root));


    }
}
