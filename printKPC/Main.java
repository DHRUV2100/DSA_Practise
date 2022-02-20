import java.io.*;
import java.util.*;

public class Main {

    public static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str, "");
    }

    public static void printKPC(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);// asf=answer so far
            return;
        }
        // remove first character of str
        String ros = str.substring(1);
        char dig = str.charAt(0)-'0';//converting form char to int
        String values=codes[dig];
        for (int i = 0; i < codes.length; i++) {
            printKPC(rom, asf+values.charAt(i));
        }

    }

}