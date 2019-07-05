package main.java;

/*
 *  https://leetcode.com/problems/longest-palindromic-substring
 */
public class LargestPalindromicSubstring {
        public String getSubstring(String s) {

            int len = s.length();

            if(len <= 1){
                return s;
            }
            int[] index= new int[2];
            for(int i=0 ; i<len; i++){

                lp(s, i+1, i,index);//even
                lp(s, i, i, index);//odd
            }
            return s.substring(index[0], index[1]+1);
        }

        private void lp(String s, int min, int max, int[] index){
            while(--min>=0 && ++max<s.length()){

                if(s.charAt(min)!=s.charAt(max)){
                    break;
                }else{
                    if(index[1]-index[0]+1 < max-min+1){
                        index[0] = min;
                        index[1] = max;
                    }
                }
            }
        }
}
