import java.util.*;
public class B339{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long count = 0;
		int[]a = new int[m];
		for(int i=0;i<m;i++){
			a[i] = scan.nextInt();	
		}
		for(int i= 0;i<m;i++){
			if(i==0)count=a[i];
			else if(a[i]<a[i-1]){
				count = count +(long)n-a[i-1]+a[i];
			}
			else{
				count = count+a[i]-a[i-1];
			}
			
		}
		System.out.println(count-1);
	
	}
}
