/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
*/
public class IsPalindrome {
    public boolean isPalindromeSolution1(String s) {
        char[] str = s.toLowerCase().toCharArray();
        int i = 0, j = str.length - 1;
        while (i < j) {
            if (Character.isLetterOrDigit(str[i]) && Character.isLetterOrDigit(str[j])) {
                if (str[i] != str[j])
                    return false;
                i++;
                j--;
            } else {
                if (!Character.isLetterOrDigit(str[i])) {
                    i++;
                }
                if (!Character.isLetterOrDigit(str[j])) {
                    j--;
                }
            }

        }
        return true;
    }

    public boolean isPalindromeSolution2(String s) {

        char[] str = s.toLowerCase().toCharArray();
        int i = 0, j = str.length - 1;
        while (i < j) {
            if (isAlphaNumeric(str[i]) && isAlphaNumeric(str[j])) {
                if (str[i] != str[j])
                    return false;
                i++;
                j--;
            } else {
                if (!isAlphaNumeric(str[i])) {
                    i++;
                }
                if (!isAlphaNumeric(str[j])) {
                    j--;
                }
            }

        }
        return true;

    }

    private boolean isAlphaNumeric(int c) {
        if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
            return true;
        }
        return false;
    }
}