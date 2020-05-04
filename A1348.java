import java.util.*;
public class A1348{

        public static void main(String[]args){
                Scanner scan  = new Scanner(System.in);
                int n = scan.nextInt();
                long[]a = new long[31];
                a[0]=2;
                for(int i = 1;i<31;i++)a[i]=2*a[i-1];
                // System.out.println(Arrays.toString(a));
                while(n-->0){
                        int k = scan.nextInt();
                        long aa = 0;
                        long bb = 0;
			if(k==2){

             			System.out.println(2);
                		continue;
           		 }
                        for(int i=0;i<k/2;i++){
                         //       System.out.println("zoom "+i+" "+i%2==0+" "+a[i]+" "+a[k-i-1]);
                                if(aa<=bb)
                                aa+=a[i]+a[k-i-1];
                                else
                                bb+=a[i]+a[k-i-1];
                           //     System.out.println(aa+" "+bb+" "+k);
                        }
                        System.out.println(aa-bb+" "+aa+" "+bb);
                }
        }
}
