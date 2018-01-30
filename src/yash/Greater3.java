package yash;
import java.lang.*;
import java.util.Scanner;
public class Greater3 {
public static void main(String arg[])
{
    int a,b,c;
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    if(a<b)
    {
        if(b<c)
        {
            System.out.println(c+" is greater than all");
        }
        else
        {
            System.out.println(b+" is greater than all");
        
        }
    }
    else if(a>b)
    {
     if(a<c)
        {
            System.out.println(c+" is greater than all");
        }
        else
        {
            System.out.println(a+" is greater than all");
        }
    }
}
}
