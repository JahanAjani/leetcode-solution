import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add("" + i);
            }
        }
        return ans;
    }
}
