/**
 *
 */
package me.hockey.learn.leetcode146;

/**
 *
 *
 * 2020/5/27 0:07
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class LeetCode146Test {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        int get1 = lruCache.get(1);
        lruCache.put(3,3);
        int get2 = lruCache.get(2);
        lruCache.put(4,4);
        int get1T = lruCache.get(1);
        int get3 = lruCache.get(3);
        int get4 = lruCache.get(4);
        System.out.println();
    }
}
