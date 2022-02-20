import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] chess=new int[n][n];
        printNQueens(chess,"",0);
        // int[][] sample={{0,1,0,0},{0,0,1,0},{0,0,0,0},{0,0,0,0}};
        // System.out.print(isSafeAtPlace(sample, 1, 2));
        
    }

    public static boolean isSafeAtPlace(int[][] chess, int row ,int col)
    {
        //upper main diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--)
        {
            if(chess[i][j]==1)
                return false;
        }
        //upper column
        for(int i=0;i<row;i++)
        {    if(chess[i][col]==1)
                return false;
        }
        //upper secondary diagonal
        for(int i=row-1,j=col+1;i>=0 && j<chess[0].length;i--,j++)
        {
            if(chess[i][j]==1)
                return false;
           
        }
        return true;        

    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        //base condition
        if(row==chess.length)
        {
            System.out.println(qsf+".");
            return;
        }
        for(int col=0;col<chess[0].length;col++)
        {
            if(isSafeAtPlace(chess,row,col)==true)
            {
                chess[row][col]=1;
                printNQueens(chess,qsf+row+"-"+col+", ",row+1);
                //remove queen from the position
                chess[row][col]=0;
            }
        }
    }
}