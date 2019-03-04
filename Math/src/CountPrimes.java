/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/
 * using classic Sieve of Eratosthenes
 */
public class CountPrimes {
    public int count(int n) {
        Boolean[] prime = new Boolean[n];
        if (n <= 1) {
            return 0;
        }
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }
        int cnt = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}
