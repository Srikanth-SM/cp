package codes;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class WalterAndJesse {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int maxA = -1;
        int maxB = -1;
        for(int i=0;i<n;i++){
            int k =in.nextInt();
            maxA = Math.max(k,maxA);

        }
        for(int i=0;i<n;i++){
            int k =in.nextInt();
            maxB = Math.max(k,maxB);
        }
        if(maxA!=maxB){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }


}
