/**
 *
 */
package me.hockey.learn.leetcode25;

/**
 *
 *
 * 2020/5/16 14:51
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null || head.next == null){
            return head;
        }
        //已经反转的头尾节点
        ListNode hasReverseHead = null;
        ListNode hasReverseEnd = null;

        //下次反转开始节点
        ListNode nextReverse = head;

        //当前反转区间
        ListNode currentReverseBegin = head;
        ListNode currentReverseEnd = null;

        //当前反转内部位置
        ListNode currentPosition = null;
        ListNode currentNextPosition = null;

        //查找结束节点
        currentReverseEnd = findEndNode(currentReverseBegin,k);
        if(currentReverseEnd == null){
            return head;
        }
        nextReverse = currentReverseEnd.next;
        while (currentReverseEnd != null){
            //反转
            currentReverseEnd.next = null;
            if(currentPosition == null){
                currentPosition = currentReverseBegin;
            }
            if(currentNextPosition == null){
                currentNextPosition = currentPosition.next;
            }
            while (currentNextPosition != null){
                ListNode temp = currentNextPosition.next;
                currentNextPosition.next = currentPosition;
                currentPosition = currentNextPosition;
                currentNextPosition = temp;
            }
            //连接已转换区间头部和尾部
            if(hasReverseHead == null){
                hasReverseHead = currentReverseEnd;
            }
            if(hasReverseEnd == null){
                hasReverseEnd = currentReverseBegin;
            }else{
                hasReverseEnd.next = currentReverseEnd;
                hasReverseEnd = currentReverseBegin;
            }
            hasReverseEnd.next = null;
            //查找下一个转换区间
            currentReverseBegin = nextReverse;
            if(currentReverseBegin == null){
                break;
            }
            currentReverseEnd = findEndNode(currentReverseBegin,k);
            currentPosition = currentReverseBegin;
            currentNextPosition = currentPosition.next;
            if(currentReverseEnd != null){
                nextReverse = currentReverseEnd.next;
            }else{
                nextReverse = null;
                hasReverseEnd.next = currentReverseBegin;
            }
        }
        return hasReverseHead;

    }

    public ListNode findEndNode(ListNode begin,int k){
        ListNode end = null;
        if(begin == null || begin.next == null){
            return end;
        }
        ListNode current = begin;
        for(int i = 1; i < k; i++){
            if(current != null){
                current = current.next;
            }
        }
        end = current;
        return end;
    }


}
