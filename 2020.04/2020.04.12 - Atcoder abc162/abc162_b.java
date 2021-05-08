package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class abc162_b {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long a = 0;
        for (int i = 1; i <=n ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

            } else if (i % 3 == 0) {

            } else if (i % 5 == 0) {

            } else {
                a+=i;
            }
        }
        System.out.println(a);

    }
}
