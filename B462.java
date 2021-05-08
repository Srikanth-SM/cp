import java.util.*;
public class B462{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		long  k =(long) Integer.parseInt(s[1]);
		int n = Integer.parseInt(s[0]);
		String ss = scan.next();
		int[] c = new int[26];
		for(char cc : ss.toCharArray()){
			c[cc-'A']++;
		}
		long res = 0;
//		System.out.println(Arrays.toString(c));
		while(k>0){
			int max = 0;
			int index = -1;
			for(int i = 0;i<26;i++){
				if(c[i]>max){
					max = c[i];
					index = i;
//					System.out.println(max+" "+index);
				}
			}
			long mul = (long) Math.min(k,max);
			if(index!=-1)
			c[index]=0;

			res =res+ (long)mul*mul;

		//	System.out.println(max+" "+res);
			k = k - mul;
		}
		System.out.println(res);
	}
}
