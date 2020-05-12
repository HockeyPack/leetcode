/**
 *
 */
package me.hockey.learn.leetcode572;

/**
 *
 *
 * 2020/5/7 17:27
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null){
            return false;
        }
        //sameTree 和 subTree 步骤会有很多重复的计算,属于暴力解法
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSameTree(TreeNode s,TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if((s == null && t != null) || (s != null && t == null)){
            return false;
        }
        if(s.val != t.val) {
            return false;
        }
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
