import java.util.*;
  
  public class base_add{

      //convert from a base to decimal and them decimal to given base
      public static int DecToBase(int n, int b){
       // write code here
       int newNum=0,cnt=0;
       int q,r;
       while(n!=0)
       {
           r=n%b;
           q=n/b;
           newNum+=r*Math.pow(10,cnt);
           cnt++;
           n=q;
       }
       return newNum;
   }

      public static int getValueIndecimal(int n, int b){
      // write your code here
      int newNum=0,cnt=0;
      while(n!=0)
      {
          int last_dig=n%10;
          n=n/10;
          newNum+=last_dig*Math.pow(b,cnt);
          cnt++;
      }
      return newNum;
   }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      int sb = scn.nextInt();
      int n1d=getValueIndecimal(n1,sb);
      int n2d=getValueIndecimal(n2,sb);
      System.out.print(DecToBase(n1d+n2d,sb));

   }   
  }