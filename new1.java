import java.util.*;
class new1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String m="kabali";
        char[] ss =m.toCharArray();  
        Arrays.sort(ss);
        String sss=Arrays.toString(ss);
        String ar[]=new String[n];
        String p="";
        int count=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.next();
        }
      for(int i=0;i<n;i++)
      {
          p="";
          p=ar[i];
          char[] s2 =p.toCharArray();  
          Arrays.sort(s2);
          String s=Arrays.toString(s2);
            if(s.equals(sss))
            {
                count++;
            }
      }

        System.out.print(count);
    }
}

