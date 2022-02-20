import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        ArrayList<Integer> arr2=new ArrayList<>(arr);
        System.out.print(arr2);
        
    }
}
