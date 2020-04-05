package cp;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskJ {
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
        String flag = "YES";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i<j && grid[i][j] == 0 && grid[j][i] == 0){
                    flag = "NO";
                }
            }

        }
        System.out.println(flag);
    }
}
