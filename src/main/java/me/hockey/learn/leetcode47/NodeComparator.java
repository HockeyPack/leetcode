/**
 *
 */
package me.hockey.learn.leetcode47;

import java.util.Comparator;

/**
 *
 *
 * 2020/4/26 13:37
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class NodeComparator implements Comparator<ListNode> {
    public int compare(ListNode u1, ListNode u2) {
        if (u1.val == u2.val) {
            return 0;
        }
        if (u1.val > u2.val) {
            return 1;
        } else {
            return -1;
        }
    }
}
