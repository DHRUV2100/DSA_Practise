import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        char a=scn.next().charAt(0);   
        char b=scn.next().charAt(0); 
        char c=scn.next().charAt(0); 
        toh(n,a,b,c);
    }

    public static void toh(int n, char t1id, char t2id, char t3id){
        if(n==0)
            return;
        //faith (move n-1 rings from source to helper using destination)
        toh(n-1,t1id,t3id,t2id);
        //print move statement of nth ring from src to dest
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        //faith (move n-1 rings from helper to destination using source)
        toh(n-1,t3id,t2id,t1id);    
    }

}