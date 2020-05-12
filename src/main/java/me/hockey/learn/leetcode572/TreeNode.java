/**
 *
 */
package me.hockey.learn.leetcode572;

/**
 *
 *
 * 2020/5/7 17:28
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
