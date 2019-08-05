import java.util.*;
public class largenoo {
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	String s=in.nextLine();
	char c[]=s.toCharArray();
	String r="";String t="";
	for(int i=0;i<c.length;i++){
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
			r+=c[i]+"";
		}
		else{
			t+=c[i]+"";
		}
	}
	System.out.println(r+""+t);
}

}
