/**
 *
 */
package me.hockey.learn.leetcode105;

/**
 *
 *
 * 2020/5/22 19:15
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode105Test {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int [] preOrder = new int[]{3,9,1,2,20,15,7};
        int [] inOrder = new int[]{1,9,2,3,15,20,7};

        TreeNode root = solution.buildTree(preOrder,inOrder);
        System.out.println(root);

        preOrder = new int[]{3,9,20,15,7};
        inOrder = new int[]{9,3,15,20,7};

        root = solution.buildTree(preOrder,inOrder);
        System.out.println(root);

        preOrder = new int[]{1,2,3};
        inOrder = new int[]{3,2,1};

        root = solution.buildTree(preOrder,inOrder);
        System.out.println(root);

        preOrder = new int[]{3,9,20,15,7};
        inOrder = new int[]{9,3,15,20,7};

        root = solution.buildTree(preOrder,inOrder);
        System.out.println(root);

    }
}
