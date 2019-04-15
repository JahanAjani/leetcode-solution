/**
 * Implementation of basic Trie operations:
 * https://leetcode.com/explore/learn/card/trie/147/basic-operations/1047/
 */

class Trie {
    /**
     * Initialize your data structure here.
     */
    private boolean isEndofWord;
    private Trie[] childNodes;

    public Trie() {
        childNodes = new Trie[26];
        isEndofWord = false;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Trie pNode = this;
        for (int i = 0; i < word.length(); i++) {
            if (pNode.childNodes[word.charAt(i) - 'a'] == null) {
                pNode.childNodes[word.charAt(i) - 'a'] = new Trie();
            }
            pNode = pNode.childNodes[word.charAt(i) - 'a'];
        }
        pNode.isEndofWord = true;

    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Trie pNode = this;
        for (int i = 0; i < word.length(); i++) {
            if (pNode.childNodes[word.charAt(i) - 'a'] == null) {
                return false;
            }
            pNode = pNode.childNodes[word.charAt(i) - 'a'];
        }
        return pNode.isEndofWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {

        Trie pNode = this;
        for (int i = 0; i < prefix.length(); i++) {
            if (pNode.childNodes[prefix.charAt(i) - 'a'] == null) {
                return false;
            }
            pNode = pNode.childNodes[prefix.charAt(i) - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */