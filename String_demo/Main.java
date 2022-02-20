public class Main {
    public static void main(String[] args)
    {

        //dec syntax
        String z="Hello";
        String x=new String("BYE");

        //concatenation
        String a="abc";
        String b="def";
        String c=a+b;
        // System.out.println(c);

        int d=1234;
        // System.out.println(a+d);

        //substring
    


        //== (for non primitve dt) compares address of both data types
        int[] arr1=new int[2];
        arr1[0]=1;
        arr1[1]=2;
        int[] arr2=new int[2];
        arr2[0]=1;
        arr2[1]=2;
        if(arr1==arr2)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
