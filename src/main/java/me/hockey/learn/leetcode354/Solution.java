/**
 *
 */
package me.hockey.learn.leetcode354;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 缺少了高度的考虑，只考虑了一个宽度维度，导致会统计少数据
 *
 * 2020/4/27 12:41
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length < 0){
            return 0;
        }
        int result = 1;
        int currentWidth = -1;
        int currentHeight = -1;
        TreeMap<Integer, TreeSet<Integer>> treeMap = new TreeMap<>();
        for(int[] eachMap : envelopes){
            if(treeMap.containsKey(eachMap[0])){
                treeMap.get(eachMap[0]).add(eachMap[1]);
            }else {
                treeMap.put(eachMap[0],new TreeSet<Integer>());
                treeMap.get(eachMap[0]).add(eachMap[1]);
            }
        }

        for(Integer each : treeMap.keySet()){
            if(currentWidth < 0){
                currentWidth = each;
                currentHeight = treeMap.get(currentWidth).first();
            }else {
                if(currentWidth < each){
                    TreeSet<Integer> heightSet = treeMap.get(new Integer(each));
                    for(int tempHeight : heightSet){
                        if(currentHeight < tempHeight){
                            currentWidth = each;
                            currentHeight = tempHeight;
                            result ++ ;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
