package yash;
import java.io.*;
import java.util.Scanner;
public class Grade {
public static void main(String arg[])
{
    int a,b,c,d,e,T;
    float p;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the numbers from 100 only");
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    d=in.nextInt();
    e=in.nextInt();
    T=a+b+c+d+e;
    p=T/5;
    if(p>=60)
    {
        System.out.println("Student get first grade with "+p+"%");
    }
    else if(p<60&&p>33)
    {
        System.out.println("Student get second grade with "+p+"%");
    }
    else
    {
        System.out.println("Student get third grade with "+p+"%");
    }
}
}
