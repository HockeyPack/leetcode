/**
 *
 */
package me.hockey.learn.leetcode21;

/**
 *
 *
 * 2020/5/1 13:51
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null && l2 != null){
            if(l1.val > l2.val){
                ListNode temp = l1;
                l1 = l2;
                l2 = temp;
            }
            if(head == null){
                head = l1;
            }
            if(tail == null){
                tail = l1;
            }else {
                tail.next = l1;
                tail = tail.next;
            }
            l1 = l1.next;
        }
        if(l2 != null){
            tail.next = l2;
        }
        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
