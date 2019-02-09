import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
*/
public class FirstUniqueChar {
    public int firstUniqCharSolution1(String s) {
        Map<Character, Integer> store = new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(store.containsKey(s.charAt(i))){
                store.put(s.charAt(i), store.get(s.charAt(i))+1);
            }else{
                store.put(s.charAt(i), 1);
            }
        }
        for(int i=0; i<s.length();i++){
            if(store.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public int firstUniqCharSolution2(String s) {
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i<s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;



    }
}
