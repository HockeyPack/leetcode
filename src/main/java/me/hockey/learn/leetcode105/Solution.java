/**
 *
 */
package me.hockey.learn.leetcode105;

import me.hockey.learn.leetcode234.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *       3
 *    /    \
 *   9     20
 *        /   \
 *       15    7
 *
 *
 *
 *
 *    前序遍历 preorder = [3,9,2,20,15,7]
 *    中序遍历 inorder = [9,2,3,15,20,7]
 *           3
 *        /    \
 *       9      20
 *        \    /   \
 *         2 15    7
 *
 *
 *
 *  前序遍历 preorder = [3,9,1,2,20,15,7]
 *  中序遍历 inorder = [1,9,2,3,15,20,7]
 *         3
 *      /    \
 *     9      20
 *    / \    /   \
 *  1    2  15    7
 *
 *
 *    前序遍历 preorder = [3,20,15,7]
 *    中序遍历 inorder = [3,15,20,7]
 *           3
 *            \
 *            20
 *           /   \
 *          15    7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 执行用时 :
 * 20 ms
 * , 在所有 Java 提交中击败了
 * 6.72%
 * 的用户
 * 内存消耗 :
 * 90.7 MB
 * , 在所有 Java 提交中击败了
 * 6.67%
 * 的用户
 * 2020/5/22 16:10
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length == 0 || preorder.length == 0){
            return null;
        }
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }
        if(preorder.length == 2){
            TreeNode head =  new TreeNode(preorder[0]);
            if(preorder[1] == inorder[1]){
                head.right = new TreeNode(preorder[1]);
            }else {
                head.left = new TreeNode(preorder[1]);
            }
            return head;
        }
        //如果列表长度大于2，拆分然后递归
        int inOrderMidIndex = 0;
        int preOrderMidIndex = 0;
        int mid = preorder[preOrderMidIndex];
        TreeNode rootNode = new TreeNode(mid);
        while(inorder[inOrderMidIndex] != mid){
            inOrderMidIndex ++;
        }
        if(inOrderMidIndex > 0){
            int [] leftPreOrder = new int[inOrderMidIndex];
            int [] leftInOrder = new int[inOrderMidIndex];
            for(int i = 0 ; i < inOrderMidIndex; i++){
                leftPreOrder[i] = preorder[i+1];
            }
            for(int i = 0 ; i < inOrderMidIndex; i++){
                leftInOrder[i] = inorder[i];
            }
            TreeNode leftTree = buildTree(leftPreOrder,leftInOrder);
            rootNode.left = leftTree;
        }

        if(inOrderMidIndex < preorder.length){
            int [] rightPreOrder = new int[preorder.length - inOrderMidIndex - 1];
            int [] rightInOrder = new int[preorder.length - inOrderMidIndex - 1];

            for(int i = inOrderMidIndex + 1 ; i < preorder.length; i++){
                rightPreOrder[i-inOrderMidIndex-1] = preorder[i];
            }
            for(int i = inOrderMidIndex + 1 ; i < inorder.length; i++){
                rightInOrder[i-inOrderMidIndex - 1] = inorder[i];
            }
            TreeNode rightTree = buildTree(rightPreOrder,rightInOrder);
            rootNode.right = rightTree;
        }
        return rootNode;
    }
}