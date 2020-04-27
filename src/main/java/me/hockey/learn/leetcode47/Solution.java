/**
 *
 */
package me.hockey.learn.leetcode47;

import java.util.PriorityQueue;

/**
 *
 *
 * 2020/4/26 13:36
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        ListNode tail = null;

        PriorityQueue queue = new PriorityQueue(new NodeComparator());
        for(int indexOfList = 0; indexOfList < lists.length; indexOfList++){
            //列表中每个当前元素入队列
            ListNode current = lists[indexOfList];
            while(current != null){
                queue.add(current);
                current = current.next;
            }
        }

        while(!queue.isEmpty()){
            ListNode currentPoll = (ListNode) queue.poll();
            if(head == null){
                head = currentPoll;
            }
            if(tail == null){
                tail = currentPoll;
            }else{
                tail.next = currentPoll;
                tail = currentPoll;
            }

        }
        if(tail != null){
            tail.next = null;
        }
        return head;
    }
}
