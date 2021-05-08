import java.util.*;
public class A237{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int max = -1;
		HashMap<String,Integer> map = new HashMap<>();
		while(n-->0){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(map.get(a+" "+b)!=null){
				map.put(a+" "+b,map.getOrDefault(a+" "+b,1)+1);
			}
			else{
				map.put(a+" "+b,1);
				
			}
			if(map.get(a+" "+b)>=max){
				max = map.get(a+" "+b);
			}
		}
//		System.out.println(map);
		System.out.println(max);
	}
}
