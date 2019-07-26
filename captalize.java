import java.util.Scanner;

public class captalize {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(String i : s.split(" ")){
		String r = i.substring(0, 1);
		System.out.print(r.toUpperCase() + i.substring(1).toLowerCase()+" ");
		}
}
}

