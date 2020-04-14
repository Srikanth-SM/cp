package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.lang.reflect.Array;
import java.util.Arrays;
//This solution is wrong. Need to refer again.
public class abc162_f {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long  arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextLong();
        }
        long[]dp = new long[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        System.out.println(Arrays.toString(dp));
    }
}
