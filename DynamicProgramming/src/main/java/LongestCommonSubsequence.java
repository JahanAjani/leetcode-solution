package main.java;

public class LongestCommonSubsequence {
    public String getLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if(m==0 || n ==0){
            return "";
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return getLCS(s1.substring(0,m-1), s2.substring(0,n-1)) + s1.charAt(m-1);
        }else{
            String x = getLCS(s1, s2.substring(0,n-1));
            String y = getLCS(s1.substring(0,m-1), s2);

            return (x.length()>y.length())?x:y;
        }
    }
}
