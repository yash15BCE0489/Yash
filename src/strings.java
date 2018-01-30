import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class strings {
    public static void main(String arg[])
    {
        String a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string s1");
        a=in.next();
        System.out.println("enter the string s2");
        b=in.next();
        if(a.compareTo(b)>0)
        {
            System.out.println(a+" is greater than "+b);
        }
        else if(a.compareTo(b)<0)
        {
            System.out.println(a+" is lesser than "+b);
        }
        else
        {
            System.out.println(a+" is equal to "+b);
        }
        
    }
}
