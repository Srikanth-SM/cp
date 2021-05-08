import java.util.*;
public class A469{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n+1];
		int  p = scan.nextInt();
		for(int i = 0;i<p;i++){
			int k = scan.nextInt();
			a[k] = 1;
		}
		int q = scan.nextInt();
		for(int i = 0;i<q;i++){
			int k = scan.nextInt();
			a[k] = 1;
		}
		for(int i = 1;i<=n;i++){
			if(a[i]==0){
				System.out.println("Oh, my keyboard!");
				return;
			}
		}
		System.out.println("I become the guy.");		
	}
}
