import java.util.*;
class swapppppppp
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String m="";
        int count=0,count1=0;
        for(int i=0;i<s.length();i++)
        { count1=0;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count1++;
                }
            }
                if(count<count1)
                {
                    count=count1;
                    m=String.valueOf(s.charAt(i));
                }
          //  break;
        }
   //     System.out.print(count1);
        System.out.print(m);
    }
}
