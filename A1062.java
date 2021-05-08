import java.util.*;
public class A1062{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = scan.nextInt();
		};
		if(n<=2){
		System.out.println(0);
		return;
		}
		int start = 0;
		int count = 0,maxCount = -1;
		for(int i =1;i<n;i++){
			if(a[i]-a[i-1]==1){
				count++;
				if(start!=0 && i==n-1)count--;
			}
			else{
				count--;
				start = i;
				count = Math.max(count,0);
				maxCount = Math.max(count,maxCount);
				count = 0;
//				i++;
			}


		}
		
		maxCount = Math.max(count,maxCount);
		System.out.println(maxCount);
		
			
	}
}
