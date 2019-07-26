import java.util.*;
class palin11
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        
        System.out.print(sb.toString());
    }
}



