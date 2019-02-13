/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
Discussion around this solution can be found at:
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/discuss/236564/Straight-forward-sol-using-divide-and-conquer-strategy-and-without-inbuilt-functions
 */
public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if (strs.length == 0) {
            return s;
        }
        s = split(strs, 0, strs.length - 1);
        return s;
    }

    public String split(String[] strs, int low, int high) {
        if (low > high) {
            return "";
        }
        if (low == high) {
            return strs[low];
        }
        int med = (low + high) / 2;
        String str1 = split(strs, low, med);
        String str2 = split(strs, med + 1, high);
        return commonPrefix(str1, str2);
    }

    public String commonPrefix(String str1, String str2) {
        int len;
        StringBuilder sb = new StringBuilder();
        if (str1.length() < str2.length()) {
            len = str1.length();
        } else {
            len = str2.length();
        }

        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
