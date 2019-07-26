import java.util.Arrays;
import java.util.Scanner;

public class reepeat {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String s ="";
		int c=0;
		if(a.length() == b.length()){
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)==b.charAt(i)){
					s = s + a.charAt(i);
				}
				else{
					c++;
				}
			}
		}
		if(s!="" && c==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
}
}

