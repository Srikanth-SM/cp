package cp;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskG {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = Integer.parseInt(in.nextLine());
        int [][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            String ss [] = in.nextLine().split(" ");
            for(int j=1;j<ss.length;j++){
                grid[i][Integer.parseInt(ss[j])-1] =1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

    }
}
