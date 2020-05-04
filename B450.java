import java.util.*;
public class B450{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int n = scan.nextInt();
		int mod = (int)1e9+7;
		int[] a = new int[7];
		a[0]=(x+mod)%mod;
		a[1]=(y+mod)%mod;
		for(int i = 2;i<7;i++){
			a[i] = (a[i-1]-a[i-2]+mod)%mod;
		}
//		System.out.println(Arrays.toString(a));
		int k = (n-1)%6;
		System.out.println(a[k]);
				
	}
		
		
	
}
