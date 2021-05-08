package cp;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskP {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = Integer.parseInt(in.nextLine());
        int i =0;
        while(i<n){
            int count = 0;
            String[]s = in.nextLine().split(" ");
            for(String a:s){
                if(a.equals("1")){
                    count++;
                }
            }
            System.out.println(count);
            i++;
        }
    }
}
