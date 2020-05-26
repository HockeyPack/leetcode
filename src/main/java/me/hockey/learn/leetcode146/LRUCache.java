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

    //TODO
    private long sort = 0;

    private HashMap<Integer,Integer> cacheHash;
    private TreeMap<Long,Integer> sortMap;
    private int capacity = 0;

    public LRUCache(int capacity) {
        cacheHash = new HashMap<>(capacity);
        sortMap = new TreeMap();
        this.capacity = capacity;
    }

    public int get(int key) {
        int result = cacheHash.getOrDefault(key,-1);
        if(result != -1){
            sort++;
            sortMap.put(sort,key);
        }
        return result;
    }

    public void put(int key, int value) {
        sort++;
        int nowHas = cacheHash.size();
        if(nowHas < this.capacity){
            if(!cacheHash.containsKey(key)){
                cacheHash.put(key,value);
            }else{
                cacheHash.replace(key,value);
            }
            sortMap.put(sort,key);
        }else{
            if(!cacheHash.containsKey(key)){
                while (sortMap.size() > capacity){
                    sortMap.remove(sortMap.firstKey());
                }
                cacheHash.remove(sortMap.firstEntry().getValue());
                cacheHash.put(key,value);
            }else{
                cacheHash.replace(key,value);
            }
            sortMap.put(sort,key);
            while (sortMap.size() > capacity){
                sortMap.remove(sortMap.firstKey());
            }
        }
    }
}
