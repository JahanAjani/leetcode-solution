import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/878/
 */
public class RomanToInt {

    public int getInt(String s) {
        if (s.length() == 0) {
            return -1;
        }
        Map<Character, Integer> store = new HashMap();
        store.put('I', 1);
        store.put('V', 5);
        store.put('X', 10);
        store.put('L', 50);
        store.put('C', 100);
        store.put('D', 500);
        store.put('M', 1000);
        int sum = 0;
        int tmp;
        int t2;
        for (int i = 0; i < s.length(); ) {
            tmp = store.get(s.charAt(i));

            if (i + 1 < s.length()) {
                t2 = store.get(s.charAt(i + 1));
            } else {
                t2 = 0;
            }

            if (tmp >= t2) {
                i++;
            } else {
                tmp = t2 - tmp;
                i += 2;
            }
            sum += tmp;
        }
        return sum;
    }
}
