import java.util.*;
public class Main
{
    public static void benjamin(int n)
    {
        //print all square numbers till n
        for(int i=1;i*i<=n;i++)
        {
            System.out.println(i*i);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        benjamin(n);    
    }
}