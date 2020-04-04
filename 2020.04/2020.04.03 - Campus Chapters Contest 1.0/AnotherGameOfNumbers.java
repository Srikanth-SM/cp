package codes;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class AnotherGameOfNumbers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        double a = in.nextDouble();
        int sizeA = (int)Math.floor(Math.log(a)/Math.log(2))+1;
        double b = in.nextDouble();
        int sizeB = (int)Math.floor(Math.log(b)/Math.log(2))+1;
        int max = Math.max(sizeA,sizeB);
        double temp = a;
        int[] aa = getBits(temp,max);
        temp = b;
        int []bb = getBits(temp,max);
        int count = 0;
        double maxValue = -1;
        double maxCount = 0;
        while(count<max){
            bb  = rotateRight(bb);
            count++;
            int [] xor = findXor(aa,bb);
            double val = 0;
            for(int i=0;i<max;i++){
                val += Math.pow(2,i)*xor[i];
            }
            if(val>maxValue){
                maxValue = val;
                maxCount = count;
            }
        }
        System.out.println((int)maxCount+" "+(int)maxValue);
    }

    private int[] findXor(int[] aa, int[] bb) {
        int [] xor = new int[aa.length];
        for (int i = aa.length-1; i >=0 ; i--) {
            xor[i] = aa[i]^bb[i];
        }
        return xor;
    }

    public int [] rotateRight(int [] arr){
        int size = arr.length;
        int temp = arr[size-1];
        for(int i=size-1;i>=1;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }

    private int[] getBits(double temp,int size) {
        int [] aa = new int[size];
        int i = size-1;
        while(temp>0.9){
            int x = (int)temp%2;
            aa[i--] = x;
            temp /= 2;
        }
        return aa;
    }
}
