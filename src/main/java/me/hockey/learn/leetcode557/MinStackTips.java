/**
 *
 */
package me.hockey.learn.leetcode557;

import java.util.ArrayList;
import java.util.List;

/**
 * 官方使用辅助栈来处理,
 *
 * 入栈时候数据直接入栈，最小栈顶部元素对比当前值入栈的值，较小的值入最小栈，保证最小栈顶部一定是最小的值。
 * 出栈时候直接出栈
 * 获取顶端元素直接获取
 * 获取最小值直接获取最小栈顶部元素即可
 *
 * 2020/5/12 15:05
 * @version 1.0.0
 * @author leetcode
 *
 */
public class MinStackTips {
    /** initialize your data structure here. */
    private List<Integer> data;
    private List<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStackTips() {
        data = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    public void push(int x) {
        data.add(x);
        if (minStack.isEmpty() || minStack.get(minStack.size() - 1) >= x) {
            minStack.add(x);
        } else {
            minStack.add(minStack.get(minStack.size() - 1));
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            minStack.remove(minStack.size() - 1);
            data.remove(data.size() - 1);
        }
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
