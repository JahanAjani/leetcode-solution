import java.util.List;

/**
 * https://leetcode.com/explore/learn/card/trie/148/practical-application-i/1053/
 */
public class ReplaceWords {
    public String solution(List<String> dict, String sentence) {
        Dictionary d = new Dictionary();
        build(dict, d);
        return getRootedSentence(sentence, d);
    }

    public String getRootedSentence(String sentence, Dictionary d) {
        String[] words = sentence.split("\\s");
        StringBuilder opSentence = new StringBuilder();
        for (String word : words) {
            String finalWord = d.search(word);
            if (finalWord == null) {
                opSentence.append(word);
            } else {
                opSentence.append(finalWord);
            }
            opSentence.append(" ");
        }
        return opSentence.toString().trim();
    }

    public void build(List<String> dict, Dictionary d) {
        for (String key : dict) {
            d.insert(key);
        }
    }

    class Dictionary {
        private boolean isEndOfWord;
        private Dictionary[] childNodes;

        public Dictionary() {
            this.isEndOfWord = false;
            this.childNodes = new Dictionary[26];
        }

        public String search(String word) {
            Dictionary pNode = this;
            StringBuilder base = new StringBuilder();
            int idx;
            for (int i = 0; i < word.length(); i++) {
                idx = word.charAt(i) - 'a';
                if (pNode.childNodes[idx] == null) {
                    return null;
                }
                base.append(word.charAt(i));
                pNode = pNode.childNodes[idx];
                if (pNode.isEndOfWord) {
                    return base.toString();
                }
            }
            return null;

        }

        private void insert(String key) {
            Dictionary pNode = this;
            int idx;
            for (int i = 0; i < key.length(); i++) {
                idx = key.charAt(i) - 'a';
                if (pNode.childNodes[idx] == null) {
                    pNode.childNodes[idx] = new Dictionary();
                }
                pNode = pNode.childNodes[idx];
            }
            pNode.isEndOfWord = true;
        }
    }
}
