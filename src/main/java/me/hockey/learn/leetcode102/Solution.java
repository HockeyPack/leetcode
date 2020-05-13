/**
 *
 */
package me.hockey.learn.leetcode102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 * 2020/5/13 10:40
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> valueList = new LinkedList<>();
        if(root == null){
            return valueList;
        }
        List<TreeNode> roots = new LinkedList<>();
        roots.add(root);
        valueList.addAll(getChildren(roots));
        return valueList;

    }

    private List<List<Integer>> getChildren(List<TreeNode> parents) {
        List<List<Integer>> valueList = new LinkedList<>();
        if(parents == null){
            return valueList;
        }
        List<Integer> parentValue = null;
        List<TreeNode> children = null;

        for(TreeNode eachParent: parents){
            if(parentValue == null){
                parentValue = new LinkedList<>();
            }
            parentValue.add(eachParent.val);
            if((eachParent.left != null || eachParent.right != null)
                && children == null){
                children = new LinkedList<>();
            }
            if(eachParent.left != null){
                children.add(eachParent.left);
            }
            if(eachParent.right != null){
                children.add(eachParent.right);
            }
        }
        //增加当前层次的值列表
        valueList.add(parentValue);

        //增加子节点层次的值列表
        if(children != null){
            valueList.addAll(getChildren(children));
        }
        return valueList;
    }
}
