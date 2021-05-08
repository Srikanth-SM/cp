package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class abc162_c {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.nextInt();
        long b= 0;
        for (int i = 1; i <=k ; i++) {
            for (int j = 1; j <=k ; j++) {
                for (int l = 1; l <=k ; l++) {
                  b += gcd(i,gcd(j,l));
                }
            }
        }
        System.out.println(b);

    }
    private long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
