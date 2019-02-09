import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
*/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> store = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            store.put(s.charAt(i), store.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Integer val = store.get(t.charAt(i));
            if (val != null) {
                val -= 1;
                if (val == 0) {
                    store.remove(t.charAt(i));
                } else {
                    store.put(t.charAt(i), val);
                }
            } else {
                return false;
            }
        }
        return store.isEmpty();
    }

}
