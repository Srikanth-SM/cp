import java.util.*;
public class A320{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		char[] s = scan.nextLine().toCharArray();
		String res = "YES";
		int length = s.length;
		for(int i=0;i<length;){
		
			if( i+2<length && s[i]=='1' && s[i+1]=='4' && s[i+2]=='4' ){
				i+=3;
			}
			else if(i+1<length && s[i]=='1' && s[i+1]=='4'){
				i+=2;
			}
			
			else if(s[i]=='1'){
				i++;
			}
			else{
			//	System.out.println(i);
				res = "NO";
				break;
			} 

			
		}
		System.out.println(res);
	}
}
