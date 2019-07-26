import java.util.*;
class numPrime
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0,b=0;
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
         for (i = x; i <=y; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	      b++;
	  }	
       }	
      // System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(b);
   }
}

