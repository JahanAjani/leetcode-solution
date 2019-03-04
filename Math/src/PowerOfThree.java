/**
 *https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
 *
 * I have used log10 because for earlier solution{((Math.log(n) / Math.log(3)) % 1 == 0)} fails for 243.
 * since, natural log of 3 is greater than the actual value, so when log(N) is divide with log(3) it results in
 * inaccurate value like for N=243 log3(243) is 4.999 which is not precised.
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return ((Math.log10(n) / Math.log10(3)) % 1 == 0);
    }
}
