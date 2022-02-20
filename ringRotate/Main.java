import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn=new Scanner(System.in);
    
    public static void input2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=scn.nextInt();    
            }
        }        
    }

    public static int[] sthRingOfArr(int[][] arr,int s) {
        //make a 1 d array as per size of sth ring
        int maxR=arr.length-s;
        int minR=s-1;
        int maxC=arr[0].length-s;
        int minC=s-1;
        int size=2*(maxR-minR+maxC-minC);
        int[] ans=new int[size];
        int cnt=0;
        while(cnt<size)
        {
            //left wall
            for(int i=minR;i<=maxR && cnt<size;i++)
            {
                ans[cnt++]=arr[i][minC];
            }
            minC++;
            //bottom wall
            for(int j=minC;j<=maxC && cnt<size;j++)
            {
                ans[cnt++]=arr[maxR][j];
            }
            maxR--;
            //right wall
            for(int i=maxR;i>=minR && cnt<size;i--)
            {
                ans[cnt++]=arr[i][maxC];
            }
            maxC--;
            //top wall
            for(int j=maxC;j>=minC && cnt<size;j--)
            {
                ans[cnt++]=arr[minR][j];
            }
            minR++;
        }        
        return ans;
    }

    //reverse function with array and staring and ending point as params
    public static void reverseArr(int[] arr,int l,int r) {
        while(l<r) 
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }       
    }

    public static void rotateArr(int[] oneD,int r) {
        //conerting biggger values of r in smaller ones
        r=r%oneD.length;
        if(r<0)
            r+=oneD.length;
        //reverse first half of array
        reverseArr(oneD,0,oneD.length-1-r);
        //reverse seconf half of array
        reverseArr(oneD,oneD.length-r,oneD.length-1);
        //reverse whole array
        reverseArr(oneD,0,oneD.length-1);    
    }

    public static void update2DBy1D(int[][]arr,int[] ans,int s) {
         //make a 1 d array as per size of sth ring
         int maxR=arr.length-s;
         int minR=s-1;
         int maxC=arr[0].length-s;
         int minC=s-1;
         int size=2*(maxR-minR+maxC-minC);
         int cnt=0;
         while(cnt<size)
         {
             //left wall
             for(int i=minR;i<=maxR && cnt<size;i++)
             {
                 arr[i][minC]=ans[cnt++];
             }
             minC++;
             //bottom wall
             for(int j=minC;j<=maxC && cnt<size;j++)
             {
                 arr[maxR][j]=ans[cnt++];
             }
             maxR--;
             //right wall
             for(int i=maxR;i>=minR && cnt<size;i--)
             {
                 arr[i][maxC]=ans[cnt++];
             }
             maxC--;
             //top wall
             for(int j=maxC;j>=minC && cnt<size;j--)
             {
                 arr[minR][j]=ans[cnt++];
             }
             minR++;
         }        

    }

    public static void ringRotate(int[][] arr,int s ,int r) {
        //converting sth ring to 1d array;
        int[] oneD=sthRingOfArr(arr,s);   
        //rotate this 1d array 
        rotateArr(oneD,r);     
        //update sth ring by values of oneD array
        update2DBy1D(arr,oneD,s);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n=scn.nextInt();
        int m = scn.nextInt();
        //make an array
        int[][] arr=new int[n][m];
        input2D(arr);
        int s=scn.nextInt();
        int r=scn.nextInt();
        ringRotate(arr ,s,r);
        display(arr);
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}