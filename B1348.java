import java.util.*;
public class B1348{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int k = scan.nextInt();
			HashSet<Integer> map = new HashSet<>();
			boolean flag = false;
			for(int i = 0;i<n;i++){
				int gg = scan.nextInt();
				map.add(gg);
			}
//			System.out.println("hai");
			if(map.size()>k){
				System.out.println("-1");
				continue;
			}
//			System.out.println(map);
			
			System.out.println(k*n);
			for(int i=0;i<n;i++){
				for(int ab:map){
					System.out.print(ab+" ");
				}
				int size = map.size();
				while(size<k){
					System.out.print(size+" ");
					size++;
				}
			}		
		System.out.println();
		}
	}
}
