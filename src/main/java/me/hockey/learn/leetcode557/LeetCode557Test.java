/**
 *
 */
package me.hockey.learn.leetcode557;

/**
 *
 *
 * 2020/5/12 14:58
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode557Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   //--> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());     //--> 返回 0.
        System.out.println(minStack.getMin());    //--> 返回 -2.
    }
}
