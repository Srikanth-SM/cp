package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADDREV {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int revA = 0;
        int revB = 0;
        a = reverse(a);
//        System.out.println(a);
        b = reverse(b);
//        System.out.println(b);
        int total = a+b;
        System.out.println(reverse(total));
    }

    private int reverse(int b) {
        int rev=0;
        while (b > 0) {
            int rem = b % 10;
            b /= 10;
            rev = rem + rev * 10;
        }
        return rev;
    }
}
