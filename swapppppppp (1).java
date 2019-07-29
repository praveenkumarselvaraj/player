import java.util.*;
class swapppppppp
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String temp="";
        for(int i=0;i<s.length();i=i+2)
        {
            if(i%2==0)
            {
              temp=String.valueOf(s.charAt(i));
              System.out.print(s.charAt(i+1));
              System.out.print(temp);
            }
        }
    }
}
