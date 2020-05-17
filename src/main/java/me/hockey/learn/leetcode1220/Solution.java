/**
 *
 */
package me.hockey.learn.leetcode1220;

import java.math.BigDecimal;

/**
 *
 *
 * 2020/4/30 11:19
 * @version 1.0.0
 * @author he.jiepeng
 *
 */
public class Solution {
    public int countVowelPermutation(int n) {
        if(n == 0){
            return 0;
        }
        int mod = 1000000007;
        long a=1L, e=1L, i=1L, o=1L, u=1L;
        for(int index = 2; index <= n; index++){
            long nextA = (e + i + u) % mod;
            long nextE = (a + i) % mod;
            long nextI = (e + o) % mod;
            long nextO = i % mod;
            long nextU = (o + i) % mod;

            a = nextA;
            e = nextE;
            i = nextI;
            o = nextO;
            u = nextU;
        }
        long result = a + e + i + o + u;
        return (int) (result % mod);
    }
}
