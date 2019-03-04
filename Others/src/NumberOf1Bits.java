/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/565/
 * also read: https://catonmat.net/low-level-bit-hacks
 */
public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        while(n!=0){
            cnt += (n & 1);
            n = n >>>1;
        }
        return cnt;
    }
}
