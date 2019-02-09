/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
*/
public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length > 0) {
            for (int i = 0; i < (s.length / 2); i++) {
                int j = s.length - 1 - i;
                if (s[i] != s[j]) {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }

            }
        }
    }
}