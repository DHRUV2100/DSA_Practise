import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] chess= new int[n][n];
        int r=scn.nextInt();
        int c=scn.nextInt();
        printKnightsTour(chess,r,c,1);
        
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcoming) {
        //base case
        if( r < 0 || c < 0 || r>=chess.length || c>=chess[0].length || chess[r][c]!=0)
        {
            if(upcoming==chess.length*chess.length+1)
                displayBoard(chess);
                // System.out.println(upcoming+" "+chess.length*chess.length);

            return;
        }
        //mark visit at cell of chess
        chess[r][c]=upcoming;
        //2 top 1 right call
        printKnightsTour(chess,r-2,c+1,upcoming+1);
        printKnightsTour(chess,r-1,c+2,upcoming+1);
        printKnightsTour(chess,r+1,c+2,upcoming+1);
        printKnightsTour(chess,r+2,c+1,upcoming+1);
        printKnightsTour(chess,r+2,c-1,upcoming+1);
        printKnightsTour(chess,r+1,c-2,upcoming+1);
        printKnightsTour(chess,r-1,c-2,upcoming+1);
        printKnightsTour(chess,r-2,c-1,upcoming+1);

        // /unmark here
        chess[r][c]=0;

    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}