import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] visited= new int[n][m];
        floodfill(arr, 0, 0, "",visited);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int r, int c, String asf,int[][] visited) {
        //base case
        if(r<0 || c<0 || r == maze.length || c == maze[0].length || maze[r][c]==1 || visited[r][c]==1)
        {
            return;
        }
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(asf);
            return;
        }
        //mark visited 
        visited[r][c]=1;
        //call for top
        floodfill(maze,r-1,c,asf+"t",visited);
        //call for left
        floodfill(maze,r,c-1,asf+"l",visited);
        // call for down
        floodfill(maze,r+1,c,asf+"d",visited);
        //call for right
        floodfill(maze,r,c+1,asf+"r",visited);
        // mark unvisited
        visited[r][c]=0;

    }
}
