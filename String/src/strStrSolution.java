/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
 */
public class strStrSolution {
    public int strStr(String haystack, String needle) {
        int j;
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            j = 0;
            if (haystack.charAt(i) == needle.charAt(j++)) {

                for (int k = i + 1; k < haystack.length() && j < needle.length(); k++) {
                    if (haystack.charAt(k) != needle.charAt(j)) {
                        break;
                    } else {
                        j++;
                    }
                }
                if (j == needle.length()) {
                    return i;
                }
            }

        }
        return -1;
    }
}
