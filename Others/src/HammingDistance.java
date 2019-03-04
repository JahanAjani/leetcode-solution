/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/
 */
public class HammingDistance {
    public int count(int x, int y) {

        int cnt = 0;
        int tmp = x ^ y;
        while (tmp != 0) {
            cnt += (tmp & 1);
            tmp = tmp >>> 1;
        }
        return cnt;
    }
}
