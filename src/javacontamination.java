import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class javacontamination {
    public static void main(String arg[])
    {
        String s1,s2,s,s4;
        Scanner in=new Scanner(System.in);
        s1=in.next();
        s2=in.next();
        s4="/";
        s=s1.concat(s2);
        System.out.println(s+" Size of String is "+s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toUpperCase()+"            "+s.endsWith(s2));
    }
}
