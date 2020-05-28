/**
 *
 */
package me.hockey.learn.leetcode146;

import java.util.*;

/**
 *
 *
 * 2020/5/25 23:48
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class LRUCache {
    private long sort = 0;
    private HashMap<Integer,Integer> cacheHash;
    private TreeMap<Long,Integer> sortMap;
    private HashMap<Integer,Long> keySetMap;
    private int capacity = 0;

    public LRUCache(int capacity) {
        cacheHash = new HashMap<>(capacity+1);
        keySetMap = new HashMap<>(capacity+1);
        sortMap = new TreeMap();
        this.capacity = capacity;
    }

    public int get(int key) {
        int result = cacheHash.getOrDefault(key,-1);
        if(result != -1){
            sort++;
            sortMap.remove(keySetMap.get(key));
            sortMap.put(sort,key);
            keySetMap.replace(key,sort);
        }
        return result;
    }

    public void put(int key, int value) {
        sort++;
        int result = cacheHash.getOrDefault(key,-1);
        //更新
        if(result != -1){
            sortMap.remove(keySetMap.get(key));
            keySetMap.replace(key,sort);
        } else{
            int size = cacheHash.size();
            if (size >= capacity){
                int removeKey = sortMap.firstEntry().getValue();
                Long sortValue = keySetMap.remove(removeKey);
                cacheHash.remove(removeKey);
                sortMap.remove(sortValue);
            }
            keySetMap.put(key,sort);
        }
        sortMap.put(sort,key);
        cacheHash.put(key,value);
    }
}
