/**
 *
 */
package me.hockey.learn.leetcode236;

/**
 *
 *
 * 2020/5/12 11:50
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode236Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.left.left = null;
        root.left.left.right = null;
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode node = new Solution().lowestCommonAncestor(root,new TreeNode(5),new TreeNode(2));
        System.out.println(node);
        System.out.println(node == null ? null :node.val);
    }
}
