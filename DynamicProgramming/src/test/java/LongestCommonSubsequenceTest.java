package test.java;

import main.java.LongestCommonSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequenceTest {

    LongestCommonSubsequence longestCommonSubsequence;

    @Test
    public void testLCS(){
        longestCommonSubsequence = new LongestCommonSubsequence();
        String lcs = longestCommonSubsequence.getLCS("ABCBDAB", "BDCABA");
        System.out.println(lcs);
        Assert.assertTrue("lcs should not be null",lcs !=null);
    }
}