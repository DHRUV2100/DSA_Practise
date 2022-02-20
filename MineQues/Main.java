import java.io.*;
import java.util.*;

public class Main {

    public static boolean notInbounds(int i,int j ,int[][] maze)
    {
        if(i<0||j<0||i>=maze.length||j>=maze[0].length)
            return false;
        return true; 
    } 
    
    public static void warMines(int[][] maze,int r,int c,int dist,int[][] visited)
    {
        //base case
        if(r<0||r>=maze.length||c<0||c>=maze[0].length||maze[r][c]==0||maze[r][c]==-1||visited[r][c]==1)
        return;
        
        //base case with answer
        if(c==maze[0].length-1)
        {
            ans.add(dist);
            return;
        }    
        
        ///mark cell as visited
        visited[r][c]=1;
        //go right
        warMines(maze, r, c+1, dist+1, visited);
        //go bottom
        warMines(maze, r+1, c, dist+1, visited);
        //go left
        warMines(maze, r, c-1, dist+1, visited);
        //go top
        warMines(maze, r-1, c, dist+1, visited);
        //mark cell as unvisited
        visited[r][c]=0;
    }
    

    public static ArrayList<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        int[][] visited = new int[n][m];
        // inputting matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        //mark unsafe cells with -1
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++) {
                if(maze[i][j]==0)
                {
                    //top//left//down//right
                    if(notInbounds(i-1,j,maze))
                        maze[i-1][j]=-1;
                    if(notInbounds(i,j+1,maze))
                        maze[i][j+1]=-1;
                    if(notInbounds(i+1,j,maze))
                        maze[i+1][j]=-1;
                    if(notInbounds(i,j-1,maze))
                        maze[i][j-1]=-1;

                }                
            }
        }

        // for (int i = 0; i < maze.length; i++) {
        //     for (int j = 0; j < maze[0].length; j++) {
        //         System.out.print(maze[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for each row
        for (int i = 0; i < n; i++) {
            warMines(maze, i, 0, 0, visited);
            // maze,row,column,distance,visted
        }
        if (ans.size() == 0) {
            System.out.println("soldier:KIA");
        } 
        else 
        {
            int min = Integer.MAX_VALUE;
            // loop to find minmum element in ArrayList ans
            for (int i = 0; i < ans.size(); i++) {
                int val = ans.get(i);
                if (val < min) {
                    min = val;
                }
            }
            // print minumum path
            System.out.println(min);
        }
    }
}