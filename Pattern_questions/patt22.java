
// 1       2       3       4       5
// 2                       5
// 3               5
// 4       5
// 5


import java.util.Scanner;

public class patt22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces=n-1, val;
        for (int i = 0; i < n; i++) {
            val = i + 1;
            if (i == 0) {
                spaces = n - 2;
                for (int j = 0; j < n; j++)
                    System.out.print(val++ + "\t");
            } 
            else {
                System.out.print(val + "\t");
                for (int j = 0; j < spaces; j++) {
                    System.out.print("\t");
                }
                if (val != n) {
                    System.out.print(n + "\t");
                }
            }
            // update
            spaces--;
            System.out.println();
        }
    }
}
