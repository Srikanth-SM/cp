package cp;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskN {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String [] s = in.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int grid[][] = new int[n][n];
        while(m-->0){
            String g [] = in.nextLine().split(" ");
            int a = Integer.parseInt(g[0]);
            int b = Integer.parseInt(g[1]);
            --a;--b;
            grid[a][b]=1;
            grid[b][a]=1;
        }
        int hangingVertices = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==1){
                    count++;
                }
            }
            if(count==1)
                hangingVertices++;

        }
        System.out.println(hangingVertices);
    }
}
