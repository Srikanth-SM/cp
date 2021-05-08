package codes;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class AnotherGameOfNumbers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        double a = in.nextDouble();
        int sizeA  = 0;
        double temp = a;
        while(temp>0.9){
            sizeA++;
            temp>>1;
        }
        System.out.println();
    }
}
