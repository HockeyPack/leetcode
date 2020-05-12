/**
 *
 */
package me.hockey.learn.leetcode236;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *
 *
 * 2020/5/11 17:02
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode>[] parentList = new ArrayDeque[2];
        parentList[0] = new ArrayDeque<>();
        parentList[1] = new ArrayDeque<>();
        matchParent(root,p,q,parentList);
        Object[] nodeArray = parentList[1].toArray();
        while (!parentList[0].isEmpty()){
            TreeNode node = parentList[0].pollFirst();
            for(Object node1 : nodeArray){
                if(node.val == ((TreeNode)node1).val){
                    return node;
                }
            }
        }
        return  null;
    }

    /**
     *
     * @param root
     * @param p
     * @param q
     * @param parentList
     * @return 0 找不到， 1 找到p  2 找到q 3 都找到
     */

    public int matchParent(TreeNode root, TreeNode p, TreeNode q,Deque<TreeNode>[] parentList){
        if(root == null){
            return 0;
        }
        int find = 0;
        if(parentList[0].peek() != null && parentList[0].peek().val == p.val){
            find += 1;
        }else{
            parentList[0].push(root);
            if(p.val == root.val){
                find += 1;
            }
        }

        if(parentList[1].peek() != null && parentList[1].peek().val == q.val){
            find += 2;
        }else {
            parentList[1].push(root);
            if (q.val == root.val) {
                find += 2;
            }
        }
        if(find != 3 && root.left != null) {
            find = matchParent(root.left, p, q, parentList);
        }
        if(find != 3 && root.right != null){
            find = matchParent(root.right, p, q, parentList);
        }

        if(find == 0){
            TreeNode node1 = parentList[1].peek();
            if(node1.val == root.val){
                parentList[1].poll();
            }
            TreeNode node0 = parentList[0].peek();
            if(node0.val == root.val){
                parentList[0].poll();
            }
        }

        if(find == 1){
            TreeNode node = parentList[1].peek();
            if(node.val == root.val){
                parentList[1].poll();
            }
        }
        if(find == 2){
            TreeNode node = parentList[0].peek();
            if(node.val == root.val){
                parentList[0].poll();
            }
        }
        return find;
    }
}