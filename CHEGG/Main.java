import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int result= Math.min(a,b);
        result=Math.min(result,c);
        System.out.println(result);
    }
}