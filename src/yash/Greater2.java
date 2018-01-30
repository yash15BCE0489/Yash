package yash;
import java.lang.*;
import java.util.Scanner;
public class Greater2 {
public static void main(String arg[])
{
    int a,b;
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
    if(a<b)
    {
        System.out.println(b+" is greater than "+a);
    }
    else
    {
        System.out.println(b+" is lesser than "+a);
    }
}
}
