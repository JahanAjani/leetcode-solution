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
        Assert.assertTrue("lcs should not be null",lcs !=null);
        Assert.assertTrue("lcs should be equal to: ",lcs.equals("BCBA"));
    }
}