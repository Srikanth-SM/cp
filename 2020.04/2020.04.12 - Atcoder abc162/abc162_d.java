package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class abc162_d {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        char[] s = in.nextString().toCharArray();
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if ( s[i] != s[(i+k)/2] && s[(i+k)/2] != s[k] && s[k] != s[i]) {
                        count++;
                    System.out.println(i+" "+ (i+k)/2+" "+k);
                    }
            }
        }
        System.out.println(count);
    }
}
