package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class Prime1 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
//        int t = in.nextInt();
//        while(testNumber-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
//            System.out.println(n+" "+m);
            for(int i = Math.max(2,n); i<=m; i++){
                boolean flag = true;
                for (int j = 2; j*j <=i ; j++) {
                    if(i!=j && i%j==0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(i);
                }
            }
            System.out.println();
//        }

    }
}
