import java.util.Stack;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 */
public class PlusOne {

    public int[] solution_1(int[] digits) {

        Stack<Integer> res = new Stack<>();

        int i = digits.length;
        int lst = digits[--i] + 1;
        res.push(lst % 10);
        while (i > 0) {
            if ((lst / 10) > 0) {
                lst = digits[--i] + 1;
            } else {
                lst = digits[--i];
            }
            res.push(lst % 10);
        }
        if ((lst / 10) > 0) {
            res.push(1);
        }
        int[] f = new int[res.size()];
        for (int j = 0; j < f.length; j++) {
            f[j] = res.pop();
        }
        return f;
    }

    public int[] solution_2(int[] digits) {

        int carry = 1;
        int lst;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry == 1) {
                lst = digits[i] + carry;
                digits[i] = lst % 10;

                if (lst / 10 == 0) {
                    carry = 0;
                }
            } else {
                return digits;
            }
        }
        if (carry == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, res.length - 1);
            return res;
        }
        return digits;
    }
}
