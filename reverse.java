import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=1;
        int newNum=0;
        while(n!=0)
        {
            int ld=n%10;
            n=n/10;
            newNum+=i*(int)Math.pow(10,ld-1);
            i++;
        }
        System.out.println(newNum);
    }
}
