// We saw here that arrays can be edited through a fucntion but we cant do the same for int


public class swap_check {
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }

    public static void swapArr(int[] a,int i,int j )
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
    public static void main(String[] args)
    {
        int a=10,b=30;
        swap(a,b);
        System.out.println(a+" "+b);
        // int[] arr=[10,30];
        int[] arr=new int[2];
        arr[0]=10;
        arr[1]=30;
        swapArr(arr,0,1);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
