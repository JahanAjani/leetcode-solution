import java.util.Stack;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/721/
 */
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                s1.push(c);
            } else if (c == ']') {
                if (s1.isEmpty() || s1.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (s1.isEmpty() || s1.pop() != '{') {
                    return false;
                }
            } else if (c == ')') {
                if (s1.isEmpty() || s1.pop() != '(') {
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}
