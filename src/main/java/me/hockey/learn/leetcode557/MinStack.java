/**
 *
 */
package me.hockey.learn.leetcode557;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * 2020/5/12 14:10
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class MinStack {

    /** initialize your data structure here. */
    private int minIndex = 0;
    private List<Integer> container = new ArrayList();


    public MinStack() {

    }

    public void push(int x) {
        container.add(x);
        if(container.size() == 1){
            minIndex = 0;
        }else{
            if(x < container.get(minIndex)){
                minIndex = container.size() - 1;
            }
        }
    }

    public void pop() {
        container.remove(container.size() - 1);
        if(minIndex == container.size()){
            findMin(container);
        }

    }

    private void findMin(List<Integer> container) {
        int tempMinIndex = 0;
        for(int index = 0; index < container.size();index ++ ){
            if(container.get(index) < container.get(tempMinIndex)){
                tempMinIndex = index;
            }
        }
        minIndex = tempMinIndex;
    }

    public int top() {
        return container.get(container.size()-1);
    }

    public int getMin() {
        return container.get(minIndex);
    }
}
