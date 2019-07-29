import java.util.*;
class ABC
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int n=3;
        a=a.toUpperCase();
        char s;
        String n1;
        for(int i=0;i<a.length();i++)
        {
            s=a.charAt(i);
            if(s>='A'&&s<='Z')
            {
                s=(char)(s+n);
                if(s>'Z')
                {
                    s=(char)(s-'Z'+'A'-1);
                }
                System.out.print(s);
            }
           //System.out.print(n1); 
        }
    }
}

