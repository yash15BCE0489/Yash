package yash;
import java.io.*;
import java.util.Scanner;
public class Factorial {
    public  static void main(String arg[])
    {
        int n,s=1,i=1;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        while(n>=1)
        {
            s=(s*n);
            n--;
        }
        System.out.println(s);
    }
}