import java.util.*;
class palin11
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String s=sc.next();
        //String s1="";
        int a=0;
        for(int i=0;i<s.length();i++)
        {
           char s1=s.charAt(i);
            if(s1=='I')
            {
                a+=1;
            }
            else if(s1=='V')
            a+=5;
            else if(s1=='X')
            a+=10;
        }
            System.out.print(a);
    }
}



