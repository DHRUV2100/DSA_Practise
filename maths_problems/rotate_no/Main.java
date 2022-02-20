import java.util.*;
   
   public class Main{
   
   public static int digits(int n)
   {
       int cnt=0;
       while (n!=0) {
           n=n/10;
           cnt++;
       }
       return cnt;
   }
   
   public static int rotate(int n,int k)
   {
       int nod=digits(n);
       //reduce k in limit
       k=k%nod;
       if(k<0)
        k+=nod;
       int right=n%(int)Math.pow(10,k);
       int left=n/(int)Math.pow(10,k);
       
       //swap left and right
       int newNum=right*((int)Math.pow(10,nod-k))+left;
       return newNum; 
   }
   
   public static void main(String[] args) {
     // write your code here
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int k=scn.nextInt();
     System.out.println(rotate(n, k));  
    }
   } 