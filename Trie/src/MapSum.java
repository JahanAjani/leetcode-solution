import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/explore/learn/card/trie/148/practical-application-i/1058/
 */
class MapSum {

    /**
     * Initialize data structure.
     */
    private int value;
    private MapSum[] childNodes;

    public MapSum() {
        this.childNodes = new MapSum[26];
        this.value = 0;
    }

    public void insert(String key, int val) {
        MapSum pNode = this;
        for (int i = 0; i < key.length(); i++) {
            if (pNode.childNodes[key.charAt(i) - 'a'] == null) {
                pNode.childNodes[key.charAt(i) - 'a'] = new MapSum();
            }
            pNode = pNode.childNodes[key.charAt(i) - 'a'];
        }
        pNode.value = val;
    }

    public int sum(String prefix) {
        MapSum pNode = this;
        int cnt = 0;
        for (int i = 0; i < prefix.length(); i++) {
            if (pNode.childNodes[prefix.charAt(i) - 'a'] == null) {
                return 0;
            }
            pNode = pNode.childNodes[prefix.charAt(i) - 'a'];
        }
        Queue<MapSum> q = new LinkedList<>();
        q.offer(pNode);
        while (!q.isEmpty()) {
            pNode = q.poll();
            cnt += pNode.value;
            for (MapSum p : pNode.childNodes) {
                if (p != null) {
                    q.offer(p);
                }
            }
        }
        return cnt;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */