/**
 *
 */
package me.hockey.learn.leetcode21;

/**
 *
 *
 * 2020/5/1 18:20
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode21Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(10);
        ListNode result = new Solution().mergeTwoLists(l1,l2);

        ListNode temp = result;
        boolean head = true;
        while (temp != null){
            if(head){
               head = false;
            }else {
                System.out.print("->");
            }
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
