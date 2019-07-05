package main.java;

import java.util.Set;
import java.util.TreeSet;

public class ReverseWordsInaString {

    public void reverseWordsInPLace(char[] s){

        int j = s.length-1;
        int i=0;
        Set<Integer> spaceIndex = new TreeSet<>();
        while(i<j){

            swap(i,j, s);
            if(s[i] == ' '){
                spaceIndex.add(i);
            }
            if(s[j] == ' '){
                spaceIndex.add(j);
            }
            i++;
            j--;
        }
        spaceIndex.add(s.length);

        int l = 0;
        for(int k : spaceIndex){
            int r = k-1;
            while(l<r) {
                swap(l, r, s);
                l++;
                r--;
            }
            l=k+1;
        }
    }

    private void swap(int i, int j, char[] s) {
        char a = s[j];
        s[j] = s[i];
        s[i] = a;
    }

    public static void main(String[] args){
        String s= "the sky is blue";
        ReverseWordsInaString strRev = new ReverseWordsInaString();
        char[] str = s.toCharArray();

        System.out.println(str);

        strRev.reverseWordsInPLace(str);

        System.out.println(str);
    }
}
