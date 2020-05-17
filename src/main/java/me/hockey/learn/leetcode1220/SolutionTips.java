/**
 *
 */
package me.hockey.learn.leetcode1220;

/**
 *
 *
 * 2020/5/17 22:07
 * @version 1.0.0
 * @author leetcode
 *
 */
class SolutionTips {
    public int countVowelPermutation(int n) {

        long a = 1, e = 1, i = 1, o = 1, u = 1;
        int mod = 1000000007;
        for (int x = 2; x <= n; x++) {

            long a_tmp = e;
            long e_tmp = (a + i) % mod;
            long i_tmp = (a + e + o + u) % mod;
            long o_tmp = (i + u) % mod;
            long u_tmp = a;

            a = a_tmp;
            e = e_tmp;
            i = i_tmp;
            o = o_tmp;
            u = u_tmp;
        }

        return (int)((a + e + i + o + u) % mod);
    }
}
