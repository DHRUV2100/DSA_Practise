// *                                                                       *
// *       *                                                       *       *
// *       *       *                                       *       *       *
// *       *       *       *                       *       *       *       *
// *       *       *       *       *       *       *       *       *       *
// *       *       *       *       *       *       *       *       *       *
// *       *       *       *       *       *       *       *       *       *
// *       *       *       *                       *       *       *       *
// *       *       *                                       *       *       *
// *       *                                                       *       *

import java.util.Scanner;

public class patt23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n - 2;
        for (int i = 0; i < n; i++) {
            if (i == n / 2 || i == (n / 2 - 1)) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*\t");
                }
            } else {
                // stars
                for (int j = 0; j < stars; j++)
                    System.out.print("*\t");

                // spaces
                for (int j = 0; j < spaces; j++)
                    System.out.print("\t");

                // stars
                for (int j = 0; j < stars; j++)
                    System.out.print("*\t");

            }
            System.out.println();            
            //update
            if(i!=n/2 ||i!=(n/2-1))
            {
                if(i<n/2)
                {
                stars++;
                spaces-=2;
                }
                else
                {
                    stars--;
                    spaces+=2;
                }
            }
        }
    }
}
