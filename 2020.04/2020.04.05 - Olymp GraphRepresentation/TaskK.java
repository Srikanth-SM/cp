package cp;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskK {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String [] s = in.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        String grid[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = in.nextLine().split(" ");
        }
        String flag = "NO";
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(i==j && grid[i][j].equals("1")) {
                    flag = "YES";
                }
            }

        }
        System.out.println(flag);
    }
}
