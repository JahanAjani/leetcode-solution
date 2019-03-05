import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/601/
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> arr = new ArrayList<>();
        for (int j = numRows; j > 0; j--) {
            if (res.size() == 0) {
                arr.add(1);
                res.add(arr);
            } else {
                arr = res.get(res.size() - 1);
                List<Integer> a1 = new ArrayList<>();
                a1.add(1);
                for (int i = 0; i < arr.size() - 1; i++) {
                    a1.add(arr.get(i) + arr.get(i + 1));
                }
                a1.add(1);
                res.add(a1);
            }
        }
        return res;
    }
}
