package cp;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskE {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = Integer.parseInt(in.nextLine());
        String[][]grid = new String[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = in.nextLine().split(" ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j].equals("1")){
                    System.out.println((i+1)+" "+(j+1));
                }
            }

        }
    }
}
