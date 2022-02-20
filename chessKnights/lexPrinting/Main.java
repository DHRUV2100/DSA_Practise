import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> ans=new ArrayList<>();
    public static void lexPrinting(int n, String ssf)
    {
        if(ssf=="")
        {
            ssf="0";
        }
        //base case
        if(Integer.parseInt(ssf)>n)
        {
            return;
        }
        for(int j=0;j<=9;j++)
        {
            if(ssf=="0")
            {
                if(j==0)
                    continue;
            }
            int prev=Integer.parseInt(ssf);
            int num=prev*10+j;
            if(num<n)
            {
                // ans.add(num);
                System.out.println(num);
                lexPrinting(n, Integer.toString(num));
            }
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        lexPrinting(n,"");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}