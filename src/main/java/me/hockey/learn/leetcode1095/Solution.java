/**
 *
 */
package me.hockey.learn.leetcode1095;

/**
 *
 *
 * 2020/4/29 21:42
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int topIndex = findTop(mountainArr,0,length - 1);
        int matchIndex = findMatch(mountainArr,target,0,topIndex,true);
        if(matchIndex != -1){
            return matchIndex;
        }else {
            matchIndex = findMatch(mountainArr,target,topIndex+1,length-1,false);
        }
        return matchIndex;

    }

    public int findMatch(MountainArray mountainArray,int target,int from,int to,boolean up){
        if(from == to){
            if(mountainArray.get(from) == target){
                return from;
            }
            return -1;
        }else if(to - from == 1){
            if(mountainArray.get(from) == target){
                return from;
            }
            if(mountainArray.get(to) == target){
                return to;
            }
        }else {
            int midIndex = (from + to)/2;
            int midValue = mountainArray.get(midIndex);
            if(midValue == target){
                return midIndex;
            } else if(midValue > target){
                if(up){
                    return findMatch(mountainArray,target,from,midIndex-1,up);
                }else{
                    return findMatch(mountainArray,target,midIndex + 1,to,up);
                }
            }else {
                if(up){
                    return findMatch(mountainArray,target,midIndex + 1,to,up);
                }else{
                    return findMatch(mountainArray,target,from,midIndex-1,up);
                }
            }
        }
        return -1;
    }


    public int findTop(MountainArray mountainArray,int from, int to){
        if(from == to){
            return from;
        }
        if(to - from == 1){
            if(mountainArray.get(from) > mountainArray.get(to)){
                return from;
            }
            else {
                return to;
            }
        }
        int topIndex = (from + to)/2;
        if(mountainArray.get(topIndex) > mountainArray.get(topIndex + 1)){
            return findTop(mountainArray,from,topIndex);
        }else{
            return  findTop(mountainArray,topIndex + 1,to);
        }
    }
}