import java.util.*;
public class A337{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[m];
		for(int i=0;i<m;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		int min = 1001;
		for(int i = 0;i+n<m+1;i++){
//			System.out.println(i);
			int diff = arr[i+n-1]-arr[i];
			if(diff<min)min = diff;
		}
		System.out.println(min);
	}
}
