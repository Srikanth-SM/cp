package cp;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskL {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String [] s = in.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int grid[][] = new int[n][n];
        String flag = "NO";
        while(m-->0){
            String g [] = in.nextLine().split(" ");
            int a = Integer.parseInt(g[0]);
            int b = Integer.parseInt(g[1]);
            --a;--b;
            if(grid[a][b]==1){
                flag = "YES";
            }
            grid[a][b]=1;
//            grid[b][a]=1;
        }
        System.out.println(flag);
    }
}
