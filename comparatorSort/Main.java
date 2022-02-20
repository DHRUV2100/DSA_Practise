import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=30;
        arr[2]=1;
        arr[3]=90;
        arr[4]=210;
        Arrays.sort(arr);
        // System.out.println(arr);//address wil be printed
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
