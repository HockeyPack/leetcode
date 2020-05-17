/**
 *
 */
package me.hockey.learn.leetcode25;

/**
 *
 *
 * 2020/5/16 15:43
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode25Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next = new ListNode(11);

        ListNode result = new Solution().reverseKGroup(head,5);
        ListNode temp = result;
        boolean headFlag = true;
        while (temp != null){
            if(headFlag){
                headFlag = false;
            }else {
                System.out.print("->" );
            }
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
