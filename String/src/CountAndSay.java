/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/
 */
public class CountAndSay {
    public String countAndSaySolution(int n) {
        String s = "1";
        if(n==1){
            return s;
        }
        while(n>1){
            s = countIdx(s);
            n--;
        }
        return s;
    }
    public String countIdx( String s){
        StringBuilder sb = new StringBuilder();
        char temp = s.charAt(0);
        int cnt = 1;
        for( int j= 1; j<s.length(); j++ ){
            if (temp != s.charAt(j)) {
                sb.append(cnt);
                sb.append(temp);
                temp = s.charAt(j);
                cnt=1;
            } else {
                cnt++;
            }
        }
        sb.append(cnt);
        sb.append(temp);
        return sb.toString();
    }
}
