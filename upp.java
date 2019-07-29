import java.util.*;
 public class upp {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();String p ="";
		char [] c= s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(c[i])){
				System.out.print(Character.toLowerCase(c[i]));
					}
			else{
				System.out.print(Character.toUpperCase(c[i]));
			}
			}
			
		}
		
}
