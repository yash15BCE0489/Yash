import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class split {
    public static void main(String arg[])
    {
        String s;
        Scanner in=new Scanner(System.in);
        s=in.next();
        String s1[];
        s1=s.split("g");
        System.out.println(s1[0]);
    }
}
