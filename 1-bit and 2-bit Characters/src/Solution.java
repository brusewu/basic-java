/*
Thoughts:
check if last bit must be '0': check can it be decoded if not single-bit-0 ending?
Should check if bits with less 2 bits still valid?
DP.
dp[i]: can be decoded at i
we only actaully need to know up to dp[i - 1]
if bits[i] == 0: dp[i] = dp[i - 2] || dp[i - 1];
if bits[i] == 1: dp[i] = dp[i - 2] && bits[i - 1] == 1;
*/

public class Solution {
	public boolean isOneBitCharacter(int[] bits) {
        if (bits == null || bits.length == 0) {
            return false;
        }
        int n = bits.length;
        if (n == 1) {
            return bits[0] == 0;
        }
        if (bits[n - 1] != 0) {
            return false;
        }
        
        boolean[] dp = new boolean[n];
        dp[0] = bits[0] == 0;
        dp[1] = bits[0] != 0 || bits[1] != 1;
        for (int i = 2; i < n - 1; i++) {
            if (bits[i] == 0) {
                dp[i] = dp[i - 2] || dp[i - 1];
            } else if (bits[i] == 1) {
                dp[i] = dp[i - 2] && bits[i - 1] == 1;
            }
        }
        return dp[n - 2];
    }

}
