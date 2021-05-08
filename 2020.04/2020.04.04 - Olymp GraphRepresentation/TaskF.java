package cp;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskF {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] ss = in.nextLine().split(" ");
            ArrayList<Integer> l = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if(ss[j].equals("1")){
                    l.add(j+1);
                }
            }
            adjList.add(l);
        }
        for (int i = 0; i < n; i++) {
            int size = adjList.get(i).size();
            String ss = "";
            for (Integer e : adjList.get(i)) {
                ss = ss+e+" ";
            }
            System.out.println(size+" "+ss);
        }

    }
}
