/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/648/
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverse(int n) {
        int res = 0;
        int i = 0;
        while (i < 32) {
            res = res << 1;
            if ((n & 1) == 1) {
                res += 1;
            }
            n = n >> 1;
            i++;
        }
        return res;
    }
}
