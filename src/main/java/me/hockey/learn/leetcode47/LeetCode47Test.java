/**
 *
 */
package me.hockey.learn.leetcode47;


/**
 *
 *
 * 2020/4/26 13:03
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode47Test {
    public static void main( String[] args )
    {
//        ListNode[] nodeList = new ListNode[3];
//        nodeList[0] = new ListNode(1);
//        nodeList[0].next = new ListNode(4);
//        nodeList[0].next.next = new ListNode(5);
//
//        nodeList[1] = new ListNode(1);
//        nodeList[1].next = new ListNode(3);
//        nodeList[1].next.next = new ListNode(4);
//
//        nodeList[2] = new ListNode(2);
//        nodeList[2].next = new ListNode(6);

//        ListNode[] nodeList = new ListNode[2];
//        nodeList[0] = new ListNode(-2);
//        nodeList[0].next = new ListNode(-1);
//        nodeList[0].next.next = new ListNode(-1);
//        nodeList[0].next.next.next = new ListNode(-1);

        ListNode[] nodeList = new ListNode[1];


        ListNode head = new Solution().mergeKLists(nodeList);
        ListNode current = head;
        boolean headFlg = true;
        StringBuilder builder = new StringBuilder();
        while (current != null){
            if(!headFlg){
                builder.append("->");
            }else {
                headFlg = false;
            }
            builder.append(current.val);
            current = current.next;
        }
        System.out.println(builder.toString());
    }
}






