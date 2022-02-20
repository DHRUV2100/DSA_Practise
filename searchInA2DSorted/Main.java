import java.io.*;
import java.util.*;

public class Main {

    public static int[] searchInSorted2D(int[][] arr,int x)
    {
        int i=0;
        int j=arr[0].length-1;
        int[] ans={-1,-1};
        while(i<arr.length && j>=0)
        {
            if(arr[i][j]==x)
            {
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
            else if(x>arr[i][j])
            {
                //go downwards
                i++;
            }
            else
            {
                j--;
            }
        }
        return ans;
    }

    public static void input2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=scn.nextInt();    
            }
        }        
    }

        public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // write your code here 
        int n=scn.nextInt();
        int[][] arr=new int[n][n];
        input2D(arr);
        int target=scn.nextInt();
        int[] ans=searchInSorted2D(arr,target);
        if(ans[0]==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println(ans[0]);
            System.out.println(ans[1]);

        }
        
    }

}