import java.util.Scanner;

public class cppp {
   public static void main(String args[]){
      int number,nn=0;
      Scanner sc = new Scanner(System.in);
      //System.out.println("Enter a number ::");
      number = sc.nextInt();
      
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      //int
      if(number >2) {
          
         System.out.println(number);
          nn=number;
      }
   }
}

