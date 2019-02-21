import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/569/
 */
public class ClimbingStairs {
    Map<Integer, Integer> store = new HashMap();

    public int climbStairsSolution(int n) {
        if (n == 0) {
            return 0;
        }
        store.put(0, 1);
        int cnt = countStairs(n);

        return cnt;
    }

    public int countStairs(int n) {

        if (store.containsKey(n)) {
            return store.get(n);
        }
        int twos = 0, ones = 0;
        if (n - 2 >= 0) {
            twos = countStairs(n - 2);
        }
        if (n - 1 >= 0) {
            ones = countStairs(n - 1);
        }
        store.put(n, twos + ones);
        return twos + ones;
    }
}
